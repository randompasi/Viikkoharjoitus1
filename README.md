# Viikkoharjoitus1
First assigment is here

•	Kaikki kokonaislukutaulukon kiva alkiot ovat positiivisia.
/**
*@.pre FORALL(x : kiva; x > 0)
* @.post true
*/
•	Merkkijonossa syöte esiintyy merkki 'k'
@.pre EXISTS(i:syöte ; i.equals("k"))
@.post true
•	Kokonaislukutaulukon lottorivi minimialkiolla ei ole duplikaatteja (so. se esiintyy taulukossa vain kerran).
@.pre FORALL (i,j :a; 0<=i<j<a.Length ==> a[i]!=a[j])
              @.post true

