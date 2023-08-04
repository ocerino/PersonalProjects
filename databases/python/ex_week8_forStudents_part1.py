# first need to make sure connector is installed:
#  python3 -m pip install mysql-connector-python

# this assumes you have created a user named "testuser2" with all privileges:
#     mysql> create user 'testuser2'@'localhost' identified by 'thepassword' ;
#     mysql> grant all privileges on *.* to 'testuser2'@'localhost' ;
# to read more about how to create users: 
#  https://www.digitalocean.com/community/tutorials/how-to-create-a-new-user-and-grant-permissions-in-mysql




import mysql.connector
import numpy as np

# note:  look at at end of this file - mydb.commit() and mydb.close() -> do not forget
# MUST commit the changes!!!!  (if you did any inserts, deletes, updates, load data.... )

print ("Hello - starting pythonConnector_ex2.py")

mydb = mysql.connector.connect(
  user='testuser2',    # could be root, or a user you created, I created 'testuser2'
  passwd='password',  # the password for that use
  database='test9',   # the database to connect to
  host='127.0.0.1',   # localhost
  allow_local_infile='1'  # needed so can load local files
)



print(mydb)
myc = mydb.cursor()   # myc name short for "my cursor"

# We need to reset the variable that allows loading of local files 
myc.execute('set global local_infile = 1') 

myc.execute ("show databases")  # this returns a list in myc that you can iterate over
for x in myc:
	print(x) 

myc.execute ("use test9") 

# print out which tables are in test9
myc.execute ("show tables") 
for x in myc:
	print(x) 


myc.execute("drop table if exists Reserve ;")
myc.execute("drop table if exists Sailors ;")
myc.execute("drop table if exists Boats ;")

# multi-line python comment is three double quotes
myc.execute("""    
create table Sailors ( 
  sid int, 
  name varchar(20) NOT NULL, 
  age int, 
  rating float NOT NULL, 
  Primary Key (sid) ) ; 
""")


myc.execute("""
create table Boats (
  bid int,
  name varchar(20),
  ratingNeeded int,
  bcolor varchar(20),
  PRIMARY KEY (bid) ) ;
""")

myc.execute("""
create table Reserve (
  sid int, 
  bid int,
  rdate date,
  PRIMARY KEY (bid,sid,rdate),
  Foreign Key (bid) references Boats(bid),
  Foreign Key (sid) references Sailors(sid) ) ;
""")


print("\nBefore loading Sailors:  select * from sailors where sid < 10")
myc.execute ("select * from sailors where sid < 10") ;
for x in myc:
	print(x) 



colors = []
colors.append('red')
colors.append('green')
colors.append('blue')
colors.append('yellow')
colors.append('orange')
colors.append('purple')
colors.append('grey')
colors.append('brown')
colors.append('gold')
colors.append('silver')
colors.append('pink')
colors.append('moss')
colors.append('perwinkle')
colors.append('pumpkin')
colors.append('black')
colors.append('citron')
colors.append('coffee')
colors.append('chocolate')
colors.append('olive')
colors.append('peach')
colors.append('burnt umber')
colors.append('salmon')
colors.append('teal')
colors.append('vermilion')
colors.append('white')
colors.append('ivory')
colors.append('grape')
colors.append('lemon')
colors.append('lime')

numSailors = 100 
numBoats = 50 
numReserve = 1000 

for i in range(1,numSailors+1):
	anID = str(i)
	aName = 'Sue' + str(i)
	anAge = str(np.random.randint(80) + 18)
	aRating = str( np.random.randint(10) + 1)
	aStatement = 'insert into sailors values(' + anID + ',\'' + aName + '\',' + anAge + ',' + aRating + ');'
	print(aStatement)
	myc.execute(aStatement)

for i in range(1,numBoats+1):
	aBID = str(i)
	aBname = 'shark' + str(i)
	aRatingNeeded = str(np.random.randint(10) + 1)
	aBcolor = colors[ np.random.randint( len(colors) ) ]
	aStatement = 'insert into boats values(' + aBID + ',\'' + aBname + '\',' + aRatingNeeded + ',\'' + aBcolor + '\');'
	print(aStatement)
	myc.execute(aStatement)

for i in range(1,numReserve+1):
	sid = str( np.random.randint(numSailors) + 1)
	bid = str( np.random.randint(numBoats) + 1)
	aDate = '2020-' + str(np.random.randint(12)+1)
	aDate += '-' + str(np.random.randint(28)+1) 
	aStatement = 'insert into reserve values(' + sid + ',' + bid + ',' + '\'' +  aDate + '\');'
	print(aStatement)
	try:
		myc.execute(aStatement)
	except: 
		print("there was an error, hopefully continuing on....")


print('\nOutput from select count(*) from sailors :') 
myc.execute("select count(*) from sailors ;")
for x in myc:
	print(x) 

print('\nOutput from select count(*) from boats :') 
myc.execute("select count(*) from boats ;")
for x in myc:
	print(x) 

print('\nOutput from select count(*) from reserve :') 
myc.execute("select count(*) from reserve ;")
for x in myc:
	print(x) 

print("\nBoats that are blue")
myc.execute("select * from Boats B where B.bcolor =  'blue'") ;
for x in myc:
	print(x) 

print("\nSailor that have reserved a blue boat:")
myc.execute("select distinct S.sid, S.name from Boats B, Sailors S, Reserve R where S.sid = R.sid and R.bid = B.bid and B.bcolor =  'blue' order by S.sid ;") 
for x in myc:
	print(x) 

myc.execute("delete from Reserve where bid in (select B.bid From Boats B where  B.bcolor =  'blue') ;")

print("\nAfter the delete of blue boat reservations, Sailors that have reserved a blue boat:")
myc.execute("select distinct S.sid, S.name from Boats B, Sailors S, Reserve R where S.sid = R.sid and R.bid = B.bid and B.bcolor =  'blue' order by S.sid ;") 
for x in myc:
	print(x) 



# MUST commit the changes!!!!  (if you did any inserts, deletes, updates, load data.... )
mydb.commit()
mydb.close() 


