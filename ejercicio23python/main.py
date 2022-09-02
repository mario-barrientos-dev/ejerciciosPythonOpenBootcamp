import sqlite3

conn = sqlite3.connect('demo')
cursor = conn.cursor()

rows=cursor.execute('SELECT * FROM alumnos WHERE nombre="Mario"')
for row in rows:
    print(row)

cursor.close()
conn.close()