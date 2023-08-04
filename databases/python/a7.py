# -*- coding: utf-8 -*-
"""
Created on Wed Mar  3 20:42:15 2021

@author: Oscar Cerino
"""

import mysql.connector

mydb = mysql.connector.connect(
  user='testuser',    # could be root, or a user you created, I created 'testuser2'
  passwd='password',  # the password for that use
  database='a7',   # the database to connect to
  host='127.0.0.1',   # localhost
  allow_local_infile='1'  # needed so can load local files
)

print(mydb)
myc = mydb.cursor()   # myc name short for "my cursor"

# We need to reset the variable that allows loading of local files 
myc.execute('set global local_infile = 1') 

myc.execute ("show databases")  # this returns a list in myc that you can iterate over
print('\nresult of "show databases"')
for x in myc:
	print(x) 

myc.execute ("use a7") 
myc.execute ("select database()")
print('\nresult from "select database()"')
for x in myc:
	print(x) 

# print out which tables are in a7
print('\nresult of "show tables"') 
myc.execute ("show tables") 
for x in myc:
	print(x) 
    


#application "Delete user"
#This application takes in a user's name and finds all records pertaining to that username
#and deletes said records and shows that the deletion is successful

user_input = input("Please enter the username you would like to delete:")

print('\nresult of "select * from Users U where U.name =' + user_input +' ') 
myc.execute ("select * from Users U where U.name ='" + user_input +"'")
for x in myc:
	print(x) 
    
print('\nresult of "select * from Listens L where L.name =' + user_input +"'")
myc.execute ("select * from Listens L where L.userName ='" + user_input +"'")
for x in myc:
	print(x) 
    
myc.execute("delete from Users U where U.name ='" + user_input +"'")
myc.execute("delete from Listens L where L.userName ='" + user_input +"'" )\
    
print('Delete Successful!')

print('\nresult of "select * from Users U where U.name =' + user_input )
myc.execute ("select * from Users U where U.name ='" + user_input +"'" )
for x in myc:
	print(x) 
    
print('\nresult of "select * from Listens L where L.name ='+ user_input ) 
myc.execute ("select * from Listens L where L.userName ='" + user_input +"'")
for x in myc:
	print(x) 
    