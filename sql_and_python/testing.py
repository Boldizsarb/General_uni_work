import sqlite3

db_file = "/Users/boldizsarbanfia/Documents/University/Database/Databases/testeing.db"
db = sqlite3.connect(db_file)
cursor = db.cursor()
 # Now comest he query

sql_query = "SELECT empno, ename, deptno FROM emp"
cursor.execute(sql_query)    # executing the query
#emp_row = cursor.fetchone() # retrievign the first row
all_emp_rows = cursor.fetchall() # retrieving all rows
for emp_row in all_emp_rows:
    empno = emp_row[0]
    ename = emp_row[1]
    deptno = emp_row[2]
    print("{0},{1},{2}".format(empno, ename, deptno))
