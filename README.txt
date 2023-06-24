- Title: Student Attendance Application.

- Goal: The goal of this app is to manage and facilitate the process of taking attendance records and modifying them efficiently.

- Hierarchy:
	> We have two main users:
		- Admin.
		- Teacher Assistant.
	
	> The admin has two major roles: to manage accounts, and courses.

		- For accounts, he can:
			>> Create new account.
			>> Edit an account.
			>> Delete an Account.
			>> View existing accounts.	
	
		- For courses, he can:
			>> Create new course.
			>> Edit a course.
			>> Delete a course.
			>> View existing courses.
			>> View students who belong to a specific course.
			>> View the students who didn't attend more than 25% of course lectures. You can export them as an ecxel file. This command is exclusively used after the end of the course.
	

	> The TA has three major roles: to manage lectures, students and attendance.

		- For Lectures, he can:
			>> Create new lecture and add it to a specific course.
			>> Edit a lecture.
			>> Delete a lecture.
			>> View lectures which belong to a specific course.
			>> View attendance record of any lecture. (based on lecture id or title)

		- For students, he can:
			>> Create new student.
			>> Edit a student.
			>> Delete a student.
			>> Add a student to a specific course.
			>> Show the student attendance record in a specific course.

		- For attendance, he can:
			>> Add a student attendance of a specific lecture. You can import an excel file with the id's of attended students.
			>> Edit a student attendance.


- Project Files:
	> Models: Application, Account, Admin, Course, Lecutre, Person, Sutdent, TeacherAssistantAccount, and Data model classes.
	> Controllers: divided into:
		- Main view controller.
		- Logic controllers.
		- Admin controllers. (Accounts and Courses)
		- TA controllers. (Lectures, Students, and Attendance)
	> Views: divides similarly as controllers.
		
 
- To run the code: run the Application class.

- Sign in to the admin account: Username: abc Password: 123

- For a proper usage of the app, follow these steps in sequence:
	1. Create a TA account.
	2. Create courses.
	3. Create lectures.
	4. Create Students and add them to their courses.
	5. Add student attendance of a specific lecture.
	6. Now, you can use all other commands properly.


- Done by:
	>120212662عبد الفتاح عاطف مزيد 
	> 120192484احمد طلال جبر 