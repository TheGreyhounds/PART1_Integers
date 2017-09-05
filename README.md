# PART1_Integers
One of the most important types of primitive is the integer, which comes in many flavors (and sizes).

-The byte: 8 bits wide
-The short: 16 bits wide
-The int: 32 bits wide
-The long: 64 bits wide

But what is a primitive? In short (hehe), Java has a rule that everything in Java is an object. This
isn't completely true though. Most everything in Java is in fact an object, but certain things like
numbers, decimals, booleans (true/false values), and characters (chars) are used so frequently in
programs that to make them all true objects would lead to detrimental performance decreases. So,
Oracle compromised and made the aforementioned types, into primitive types. As we learn more about 
Object Oriented Programming (where the principle that everything in Java should be an object comes 
from), you'll see that means that you can't call a method from an int, like "add()" or "divideBy()". 
That feature is reserved solely for objects.

Time to be honest; you're probably not going to ever use short again. You might use byte, as it's
useful with some file Input/Output, but short is the most underused primitive out there. Int is the
most widely used, especially in for-loops. Long is useful as well, for really big numbers. You also 
aren't going to have to memorize the maximum and minimum values of each type. It's just handy to 
have a general idea of how much room you're dealing with.

Everything is pretty straight forward in our program, until you get to the long variables. You notice 
two things right off the bat: there are underscores in the middle of our number spacing it out, and there 
is a capital "L" at the end of each of our integer literals (again, any number without a decimal written
in a program is an integer literal). Java allows for underscores in our numbers to make them easier
to read, for cases like these. The compiler simply discards the underscores when we run "javac". The
capital "L" though is a little more complicated, because you have to understand a fundamental rule
with numbers in Java: everything is an int or a double unless specified otherwise (doubles are just
numbers with decimals, like 3.14159). When you create a byte, short, or a long, Java will automatically
convert it into an int unless you specify not to. That's why if you create a long without an "L" on
the end, that is outside the maximum or minimum values of int, Java will throw an error saying "integer
too large." For bytes and shorts, you don't specify that it's a byte by putting a "B" at the end or
that it's a short with an "S," but instead you use type casting to "undue" Java's automatic promotion rule
and convert your variable to the type you want. To use type casting, you put the identifier in parenthesis 
in front of the variable name in your expression, like this
~~~
short daysInTheYear = 365;
short weeksInTheYear = (short) daysInTheYear / 7;
~~~
The efficiency you might think you'd get from using a smaller primitive type is actually nonexistent.
The second line of the expression is compiled so that Java first sees the our short variable
"daysInTheYear", and automatically promotes it to an int. It then divides the promoted int by 7, and
sees we've type casted the int back to a short, and stores that into a new short variable called
"weekInTheYear", after checking to make sure the value was within bounds. As you can see, it is actually 
less effecient to use a short instead of an int, and so that is why most programmers choose to use
an int unless necessary. 

Another thing; if you're math savy, you might have noticed that the maximum and minimum values of 
Java's primitve types are half of what their bit width might lead you to believe. 2^(8) = 256, but
why then is the maximum value of a byte 127? This is because all primitive integers in Java are signed;
one bit at the beginning of each of the primitives is reserved for the sign of the number, 0 being
positive, 1 being negative. Thus, 7 bits are used in a byte for holding a numerical value. This is
the same for all of the other primitive integer types as well.

What you should take away from this repository is that to be a programmer, you have to think about
how your data is represented on the machine, rather than only thinking about the data abstractly. 
Thinking about how to translate something to code is critical to becoming a programmer, and choosing 
which primitive integer type to store your number is only the first step.