# COMP1721 Practical Work

This repository contains your exercise and coursework solutions for
[COMP1721 Object-Oriented Programming](https://comp1721.info).

Please remember to

* Use the appropriate directories for your work

* Begin each work session by grabbing any changes you don't yet have in your local repository, using `git pull origin master`

* Commit changes to your local repository frequently and use sensible commit messages

* Push those changes up to the remote master repository at the end of a work session, using `git push origin master`

## Coursework Submission

**This is a two-step process.**

1. Use the `finished` script at the top level of your repository, with an
   argument of either `cwk1` or `cwk2`, to mark your coursework solution as
   complete.

   For example, to mark your Coursework 1 solution, enter `./finished cwk1`.
   This will tag your solution in GitLab so that we can recognise it, then
   schedule it for testing, then create a Zip archive called `cwk1.zip`.

   Note that this script requires a bash shell in which Git and the JVM can be
   run from the command line.  It should work in a terminal window on Linux
   PCs and Macs where Git and Java have been properly installed.
   **Windows is not supported for coursework submission purposes.**
   ([Windows Subsystem for Linux](https://docs.microsoft.com/en-gb/windows/wsl/about)
   may work, but has not been tested.)

2. Upload the Zip archive that was generated by the script to Minerva.

   **Note that you MUST perform this second step in order to formally submit your work.**
   Failure to do so will delay marking of your work and incur a penalty.

### If you make a mistake

If you need to make further changes to your solution after having performed
the steps listed above, you will first need to remove the relevant tag from
your repository.  You can do this using the `notfinished` script.  For
example, to flag Coursework 1 as unfinished, enter `./notfinished cwk1`.
To flag Coursework 2 as unfinished, use `cwk2` as the script argument
instead of `cwk1`.

After you've run `notfinished`, make your changes and then run `finished`
again.  After doing this, don't forget to upload the new version of
`cwk1.zip` or `cwk2.zip` to Minerva!
