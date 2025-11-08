myList <- list(name = "Mukund", age = 20, city = 'Mumbai')
print(myList)

empId = c(1,2,3,4)
empName = c("XYZ", "ABC", "PQR", "MNO")
numberOfEmp = 4

empList = list("ID" = empId, "Name" = empName, "TotalEmp" = numberOfEmp)
print(empList$Name)
print(empList$Name[2])

#Accessing the numberofEmp column and will display data, i.e.4
print(empList[3][1])



empId = c(1,2,3,4)
empName = c("XYZ", "ABC", "PQR", "MNO")
numberOfEmp = 4

empList1 = list("ID" = empId, "Name" = empName, "TotalEmp" = numberOfEmp)
empList$TotalEmp=5
empList1[[1]][5] = 5
empList1[[2]][5] = "DEF"
print(empList1)

empList1[[2]][1] = "RAM"
empList1$Name

#Integer Conatenation
list1 = list(1,3,5,7,9)
list2 = list(2,4,6,8,10)
print(list1)
print(list2)
combined <-c(list1, list2)
print(combined)

#String Concatenation
list3 = list("ABC")
list4 = list("DEF")
print(list3)
print(list4)
combined1 <- c(list3, list4)
print(combined1)

