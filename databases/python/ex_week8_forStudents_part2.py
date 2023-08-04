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


theCommand = 'delete from reserve where sid > 0;'
myc.execute(theCommand)

theCommand = 'select * from sailors ;'
myc.execute(theCommand)

print("\n\nPrinting out sailor info at start...")
row = myc.fetchone()  # gets first row from query set, returns "None" if empty 
while row is not None:
	if (row[2] <= 20):
		print(row)
		print( row[3] )  # No real reason to do this, just showing how 
						 # toprint the 4th coloumn
		for col in row:  # No real reason to do this, just showing how to 
					     # print all the columns insted of "print row"
			print( col )
	else:
		print("sailor " + str(row[0]) + " is not <= 20 years old")
	row = myc.fetchone()  # get next row, returns "None" if at end



# Or, instead, you can use fetchall to get all rows at once
print("\n\n\n\nNow use fetchall() ")
print("\n\nUse fetchall() to get all at once")

theCommand = 'select * from reserve ;'
myc.execute(theCommand)
theRows = myc.fetchall()  # gets all rows
for aRow in theRows:
	if  (aRow[2] <= 20):
		print(aRow)
	else:   # if not 18, delete from sailors
		sid = aRow[0]
		newCommand = "delete from reserve where sid = " + str(aRow[0]) + " ;"
		print(newCommand)
		myc.execute(newCommand)
        
theCommand = 'select * from reserve ;'
myc.execute(theCommand)

print("\n\nPrinting out sailor info at end...")
row = myc.fetchone()  # gets first row from query set, returns "None" if empty 
while row is not None:
	if  (row[2] <= 20) :
		print(row)
	else:
		print("sailor " + str(row[0]) + " is not 18 years old")
	row = myc.fetchone()  # get next row, returns "None" if at end




# MUST commit the changes!!!!  (if you did any inserts, deletes, updates, load data.... )
mydb.commit()
mydb.close() 


