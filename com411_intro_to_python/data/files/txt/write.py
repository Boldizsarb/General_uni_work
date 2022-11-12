def search(file_path):
    print("searching...")
    sections = "" #empty string
    books = "books:/n"
    with open(file_path) as file: #The function should then open the specified file for reading.
        for line in file: #For each line in the file, the function should do the following:
            if line.startswith("Section"): # If the line starts with "Section" then
                sections += line #Add the line, including a new line character (\n), to the string sections.
            else: #If the line does not start with "Section" then
                books += line #   Add the line, including a new line character (\n), to the string books.
    print("Done")
    #Finally, the function should return a single string consisting 
    # of sections and books and two new line characters between them 
    # i.e. the returned string should be in the format "{sections}\n\n{books}".
    return f"{sections}\n\n{books}"
#The second function should be named save and should take 2 parameters.
#The first parameter is a file path.
#second parameter is a string that represents the data to be stored.
    
def save(file_path, data):
    print("Saving....")
    with open(file_path, "w") as file: #The function should then open the specified file for writing.
        file.write(data) # The function should then write the data to the file.
    print("Done!")
#The function should call the first function with the file path "books.txt" 
# and store the value returned by the function in a local variable named data.
def run():
    search("books.txt")
    save("exported_books.txt", data) #something is wrong. 

if __name__ == "__main__":
    run()


    