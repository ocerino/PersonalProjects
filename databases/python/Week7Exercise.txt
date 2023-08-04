# -*- coding: utf-8 -*-
"""
Created on Tue Feb 23 23:27:56 2021

@author: Oscar Cerino
"""
import mysql.connector
import numpy as np
# note:  look at at end of this file - mydb.commit() and mydb.close() -> do not forget
# MUST commit the changes!!!!  (if you did any inserts, deletes, updates, load data.... )

print ("Hello - starting createAndLoadSailorDB.py")

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

myc.execute ("show tables") 
for x in myc:
    print(x) 


myc.execute("drop table if exists Reserve ;")
myc.execute("drop table if exists Sailors ;")
myc.execute("drop table if exists Boats ;")

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

numSailors = 500
numBoats = 100 
numReserve = 5000

for i in range(1,numSailors+1):
    anID = str(i)
    aName = 'Sue' + str(i)
    anAge = str(np.random.randint(80) + 18)
    aRating = str( np.random.randint(10) + 1)
    aStatement = 'insert into sailors values(' + anID + ',\'' + aName + '\',' + anAge + ',' + aRating + ');'
    print(aStatement)
    myc.execute(aStatement)

for i in range(1,numBoats+1):
    bid=str(i)
    boatName='boat'+str(i)
    ratingNeeded=str( np.random.randint(10) + 1)
    boatColor=colors[np.random.randint(len(colors))]
    aStatement = 'insert into boats values(' + bid + ',\'' + boatName + '\',' + ratingNeeded + ',\'' + boatColor + '\');'
    print(aStatement)
    myc.execute(aStatement)

for i in range(1,numReserve+2): #did +2 because it would only give me 4999 sometimes 
    asid=str(np.random.randint(numSailors)+1)
    abid=str(np.random.randint(numBoats)+1)
    aDate='2020-'+str(np.random.randint(12)+1)+'-'+str(np.random.randint(28)+1)
    aStatement='insert into Reserve values ('+ asid+','+abid+','+'\''+aDate+'\');'
    print(aStatement)
    try:
        myc.execute(aStatement)
    except: 
        print("error trying to insert into Reserve (" + str(asid) + " " + str(abid) + " " + aDate + "), hopefully continuing on....")          

mydb.commit()

myc.execute('''
    select count(*)
    from Sailors;
''')

print ('sailors count')
for x in myc:
    print(x)

myc.execute('''
    select count(*)
    from Boats;
''')

print ('Boats count')
for x in myc:
    print(x)
    
myc.execute('''
    select count(*)
    from Reserve;
''')
print ('Reserve count')
for x in myc:
    print(x)

myc.execute('''
    select s.name, b.bcolor
    from Sailors s, Boats b, Reserve r
    where s.sid=r.sid and b.bid=r.bid and b.bcolor='blue';
''')
for x in myc:
    print(x)
    
myc.execute(''' 
    Delete 
    from Reserve r
    where Exists(
        Select *
        from Boats b, Sailors s
        where s.sid=r.sid and b.bid=r.bid and b.bcolor='blue');
''')
myc.execute('''
    select count(*)
    from Reserve;
''')
print ('Reserve count')
for x in myc:
    print(x)
           
myc.execute('''
    select s.name, b.bcolor
    from Sailors s, Boats b, Reserve r
    where s.sid=r.sid and b.bid=r.bid and b.bcolor='blue';
''')
for x in myc:
    print(x)
        
myc.execute('''
    delete
    from Sailors s, Boats b, Reserve r
    where s.sid=r.sid and b.bid=r.bid and b.bcolor='blue';
''')
for x in myc:
    print(x)
        
    

mydb.close()
    
   