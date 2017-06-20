A [Giter8][g8] template for ...!

# HMRC Scalatest-Testing-Template


This template will generate a base project which makes use of the Scalatest Featurespec framework
and includes the minimum required dependencies to function correctly.

Packages and structure is also supplied in the hopes that it will help foster a standard way of organising a test project
to make it easier for other testers to view other people's code.

This template makes use of build.sbt and plugins.sbt.

No enterprise dependencies are used so can be stored either in enterprise or in the open. (assuming of course no PI information is stored)

A chromedriver has also been included for both Windows and Linux/Apple, located in the drivers package

## How to use

SBT version 13.13 or above is required

>Navigate to the directory where you would like the project to be stored

Then enter the following:

>sbt new Stephen-Kam/testing-repository-template.g8

You'll be asked a number of questions on how to name various parts of the project

## Template license

Written in 2017 by Stephen Kam
[other author/contributor lines as appropriate]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
