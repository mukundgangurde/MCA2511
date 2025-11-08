library(readxl) #Loading 'readxl' Package
library(writexl)  #loading writexl


getwd()
xlsmp <- read_xlsx("About.xlsx", sheet=1)
print(xlsmp)
wrxl <- write_xlsx(xlsmp,"mukundxlsx.xlsx")
print("Excel file created successfully")
