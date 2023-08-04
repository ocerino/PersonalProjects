import pymongo
import pprint
import numpy as np
import datetime

from pymongo import MongoClient

client = MongoClient()  # connects on default host

db = client.db_people    

numDocs = db.theEmps.count()

# demo of update and delete commands

# To increase adjust current fields by mulitply (can also change by using $inc, or $set
# https://docs.mongodb.com/manual/reference/operator/update/mul/

# Change document pid=10 by increasin the salary field by 20% of its current value
obj = db.theEmps.find_one( { "pid" : 10 } )
print("\nBefore update_one({pid:10},{$mul:{salary:1.2}}) :")
print(obj)

aQuery = {"pid":10}
aChange = { "$mul" : {"salary": 1.2}}
db.theEmps.update_one(aQuery,aChange)

print("\nAfter update_one({pid:10},{$mul:{salary:1.2}}) :")
obj = db.theEmps.find_one( { "pid" : 10 } )
print(obj)

# change all documents whose current salary is > 99500 to 20% more
print("\n\nBefore change of += 20% for all currently earning > 99500")
objs = db.theEmps.find( {"salary": {"$gt":99500}},{"_id":0,"name":1,"salary":1} )
for anObj in objs:
	print(anObj)


aQuery =  {"salary": {"$gt":99500}}
aChange = { "$mul" : {"salary": 1.2}}
db.theEmps.update_many(aQuery,aChange)

print("\n\nAFter change")
objs = db.theEmps.find( {"salary": {"$gt":99500}},{"_id":0,"name":1,"salary":1} )
for anObj in objs:
	print(anObj)


# now demo delete_one and delete_many

db.theEmps.delete_one( {'name':'Mary33'})
print("\n\nAFter delete_one({'name':'Mary33'})" )
objs = db.theEmps.find( {"salary": {"$gt":99500}},{"_id":0,"name":1,"salary":1} )
for anObj in objs:
	print(anObj)

db.theEmps.delete_many( {'salary':{"$gt":119600} } )
print("\n\nAFter db.theEmps.delete_many( {'salary':{'$gt':119600} } )" )
objs = db.theEmps.find( {"salary": {"$gt":99500}},{"_id":0,"name":1,"salary":1} )
for anObj in objs:
	print(anObj)


