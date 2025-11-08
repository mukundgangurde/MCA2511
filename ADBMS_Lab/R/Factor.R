#Creating a vector
x<-c("female","male","male","female")
print(x)

#converting the vector x into a factor
#names gender
gender<-factor(x)
print(gender)

#Creating a factor with levels defined by programmer
gender <-factor(c("female", "male", "male", "female"),
         levels = c("female", "transgender","male"));
gender

#Checking for a Factor in R
gender <-factor(c("female","male","male","female"));
print(is.factor(gender))

#Accessing elements of a Factor in R
gender<-factor(c("female","male","male","female"));
gender[3]

#More than one element can be accessed at a time
gender <- factor(c("female","male","male","female"));
gender[c(2,4)]

#Subtract one element at a time
gender <-factor(c("female","male","male","female"));
gender[-3]

#Modification of a factor in R
gender <-factor(c("female","male","male","female"));
gender[2] <- "female"
gender


#R Program to create a dataframe
#creating  a dataframe
friend.data <- data.frame(
  friend_id = c(1:5),
  friend_name = c("Mukund","Nimish",  "Altamash", "Aniket", "Sumit"),
  stringsAsFactors = FALSE
)

#prinr the dataframe
print(friend.data)

#R Program to get the structure of the datafraem
#using str()
print(str(friend.data))

#R Program to get the summary of the dataframe
#using summary()
print(summary(friend.data))

#R program to extract data from the dataframe
#Extracting friend_name column
result <- data.frame(friend.data$friend_name)
print(result)

#R program to expand the dataframe
#Expanding dataframe
friend.data$location <- c("Kalyan","Badlapur","Nagpur","Nalasupara","Ghatkoper")
resultant <-friend.data

#Print the modified data frame
print(resultant)

#print items using[]
friend.data[1]

#access items using [[]]
friend.data[["friend_name"]]

#access items using $
friend.data$friend_id

#find out the number of rows and columns
dim(friend.data)

#add Rows and Columns in R Dataframe
#Creating a dataframe representing products in a store
Products <-data.frame(
  Products_ID = c(101,102,103),
  Product_Name=c("T-shirt","Jeans","Shoes"),
  Stock=c(50,30,25)
)

#Print the existing datframe
cat("Existing dataframe(Products) : \n")
print(Products)

#Adding a new row for a new product
New_Product <- c(104,"Sunglasses",299,40)
Products<-rbind(Products,New_Product)

#Print the updated dataframe after adding the new product
cat("\n Updated dataframe after adding a new product: \n")
print(Products)

#Adding a new column for 'Discount' to the dataframe
Discount <-c(5,10,8,15)
Products <- cbind(Products,Discount)

#Rename the added column
colnames(Products)[ncol(Products)] <- "Discount"

#Print the updated dataframe after adding the new Column
cat("\n Updated dataframe after adding a new Discount: \n")
print(Products)
