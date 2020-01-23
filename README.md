# Project Virtual Noticeboard
### Description
This Application is a virtual noticeboard for a social institution or any geographically
connected audience to be able to see relevant information concerning their environment.
 

### BDD
|feature     |Description      |
|------------|------------------
|Login| Log in to the application|
|View notices|See the notice board with available notices|
|See particular Notice|Click to see details of a particular notice|
|Add a notice|Add a notice to the noticeboard|


### Contributors
* Joel Mukono
* Thomas Maghanga
* Philip Nyatichi 


### Technologies used 
* Angular CLI
* Java (Spark)
* Git for version control
* Postgresql Database

### setup
Download Java Development kit 11. Previous or later versions may
have some minimal compatibility issue. Gradle is the tool used to 
build and run the code. Preferred IDE is IntelliJ IDEA.

In PSQL:

CREATE DATABASE noticeboard;
\c noticeboard;
CREATE TABLE users (userId SERIAL PRIMARY KEY,username VARCHAR,password VARCHAR);
CREATE TABLE comments (commentId SERIAL PRIMARY KEY,timecreated timestamp,commentText VARCHAR,noticeId INTEGER,userId INTEGER);
CREATE TABLE notice (noticeId SERIAL PRIMARY KEY,timecreated timestamp,title VARCHAR,noticeContent VARCHAR, userId INTEGER);


## Want to propose any changes?
- Fork repository
- Create new branch
- Make the proposal
- commit the changes with appropriate message on changes and push
- Create a pull request

## License
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.