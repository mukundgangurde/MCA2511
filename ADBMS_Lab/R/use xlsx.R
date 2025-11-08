library(XLConnect)

#Reading from Demo.xlsx
xlFile = XLConnect::readWorksheetFromFile("Demo.xlsx",sheet=1)
xlFile

#Reading for About.xlsx
data = XLConnect::readWorksheetFromFile("About.xlsx",sheet=1)\

#Writing About.xlsx to new sheet in Demo.xlsx as 'About' sheet
writeFile = XLConnect::writeWorksheetToFile("Demo.xlsx",data,sheet = "About")
xlFile = XLConnect::readWorksheetFromFile("Demo.xlsx",sheet="About")
xlFile
