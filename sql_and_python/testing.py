import sqlite3

db_file = "/Users/boldizsarbanfia/Documents/University/Database/Databases/testeing.db"
db = sqlite3.connect(db_file)
cursor = db.cursor()

sql_query = "SELECT ename, name FROM customer c   INNER JOIN emp e ON c.repid = e.empno ORDER BY ename"
cursor.execute(sql_query)    #

all_emp_rows= cursor.fetchall()
last_repname = ""
print("{0:10}\t{1:40}".format("Sales Rep","Customer name"))
print(f"{}")

for emp_row in all_emp_rows: # for loop needed in case of displaying all rows
    repname = emp_row[0]
    custname = emp_row[1]

    if repname != last_repname:
        #print(f"{repname}, {custname}")
        print("{0:10}\t{1:40}".format(repname, custname))
        last_repname = repname
    else:
      #  print(f"{''}, {custname} ")
      print("{0:10}\t{1:40}".format("", custname))

db.close()