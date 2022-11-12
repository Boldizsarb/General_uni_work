

import csv
import decimal

def brexit():
    eu = []
    c = 0
    eunumbers = []

    international = []
    n = 0

    with open("2020.csv") as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=',', quotechar='"')
        header = next(csv_reader)
        for row in csv_reader:
            if   row[0] == "European Union":
                eu.append(row)
                c = c+1
                print("{0}.{1}".format(c, row))
                #print(row[6])
                eunumbers.append(row[6])
            elif row[0] == "Non-European Union":
                n = n+1
                international.append(row)
                print("{0}.{1}".format(n, row))





    numbers = list(map(int, eunumbers))
    print(numbers)

    print(f"There are {c} number of students form the EU")
    print(f"There are {n} number of international students from outside of the EU")\


def qualifications_by_subject():

    medicine=[]
    medicine_number = []
    m=0
    subjectsalliedmedicine = []

    with open("qualification by subject area.csv") as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=',', quotechar='"')
        header = next(csv_reader)
        for row in csv_reader:
            if "Medicine and dentistry" in row[0] and row[5]== "2020/21":
                medicine.append(row)
                m = m+1
                #print("{0}.{1}".format(m, row))

                medicine_number.append(row[6])
            elif "Subjects allied to medicine" in row[0]:
                subjectsalliedmedicine.append(row[6])
            print(row[6])
    medicine_number = list(map(int, medicine_number))

    print(medicine_number)


    subjectsalliedmedicine = list(map(int, subjectsalliedmedicine))
    #print(f'There were {sum(medicine_number)} number of medicine students')
    print(f"There was {sum(subjectsalliedmedicine)} number of Subject allied medicine students")

#qualifications_by_subject()

def again():
    medicine = []
    m = 0
    medicine2020=[]

    with open("qualification by subject area.csv") as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=',', quotechar='"')
        header = next(csv_reader)
        for row in csv_reader:
                if row[0]== "01 Medicine and dentistry" and row[1]=="All undergraduate" and row[2] == "All" and row[3] == "All" and row[5] == "2019/20" :
                    medicine.append(row)
                    m = m + 1
                print(row[3])

    for i in medicine:
        #print(i[6])
        medicine2020.append(i[6])
    print(medicine2020)
    integermap = map(int,medicine2020)
    inteherlist = list(integermap)
    print(inteherlist)
    print(sum(inteherlist))


    again()
    print("10800")





def working_reason():

    dreamjob = []
    g = 0
    dreamjobnumber = []
    with open("work_reasondata.csv") as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=',', quotechar='"')
        for row in csv_reader:
            if "It fitted into my carer plan" in row[0] and row[1] == "All" and row [2] == "All" and row[3] == "All" and row[4] == "All" and row[5] == "High skilled":
                dreamjob.append(row)
            g =g+1
    for i in dreamjob:
        dreamjobnumber.append(i[6])

    integermap = map(int, dreamjobnumber)
    inteherlist = list(integermap)
    #print(inteherlist)
    #print(sum(inteherlist))
    print(f"There are {sum(inteherlist)} number of student doing high skilled job")








print("There are 113,045 number of student doing high skilled job")