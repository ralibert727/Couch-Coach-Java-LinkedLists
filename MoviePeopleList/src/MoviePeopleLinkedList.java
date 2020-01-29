import java.util.*;

public class MoviePeopleLinkedList {

	public static void main(String[] args) {
		
		List<MoviePeopleObj> list =  new LinkedList<MoviePeopleObj>();
		
		//Actors
		MoviePeopleObj a1 = new MoviePeopleObj(0, "Tom Hardy","Actor", "Venom- Eddy Brock/Venom, Dunkirk- Farrier");
		MoviePeopleObj a2 = new MoviePeopleObj(1, "Jason Mamoa","Actor", "Aquaman- Arthur Curry/Aquaman");
		MoviePeopleObj a3 = new MoviePeopleObj(2, "Keanu Reeves","Actor", "John Wick 2- John Wick");
		MoviePeopleObj a4 = new MoviePeopleObj(3, "Chris Hemsworth","Actor", "12 Strong- Cpt. Mitch Nelson");
		MoviePeopleObj a5 = new MoviePeopleObj(4, "Ryan Reynolds","Actor", "Deadpool 2- Deadpool/Wade Wilson");
		MoviePeopleObj a6 = new MoviePeopleObj(5, "Amber Heard","Actor", "Aquaman- Mera");
		
		MoviePeopleObj a7 = new MoviePeopleObj(6, "Chris Pratt","Actor", "Passengers- Jim Preston, Jurassic World: Fallen Kingdom- Owen Grady");
		MoviePeopleObj a8 = new MoviePeopleObj(7, "Joaquin Phoenix","Actor", "Joker- Arthur Fleck/The Joker");
		MoviePeopleObj a9 = new MoviePeopleObj(8, "Patrick Wilson","Actor", "Aquaman- Orm/Ocean Master, Conjuring 2- Ed Warren");
		MoviePeopleObj a10 = new MoviePeopleObj(9, "Yahya Abdul Mateen the 2nd","Actor", "Aquaman- Black Manta");
		MoviePeopleObj a11 = new MoviePeopleObj(10, "Laurence Fishburne","Actor", "John Wick 2- Bowery King , Passengers- Gus Mancuso");
		MoviePeopleObj a12 = new MoviePeopleObj(11, "Michelle Williams","Actor", "Venom- Anne Weying");
		MoviePeopleObj a13 = new MoviePeopleObj(12, "Riz Ahmed","Actor", "Venom- Carlton Drake/Riot");
		
		MoviePeopleObj a14 = new MoviePeopleObj(13, "Ruby Rose","Actor", "John Wick 2- Ares");
		MoviePeopleObj a15 = new MoviePeopleObj(14, "Common","Actor", "John Wick 2- Cassian");
		MoviePeopleObj a16 = new MoviePeopleObj(15, "Riccardo Camarcio","Actor", "John Wick 2- Santino D'Antonio");
		MoviePeopleObj a17 = new MoviePeopleObj(16, "Zazie Beetz","Actor", "Deadpool 2- Domino, Joker- Sophie Dumond");
		MoviePeopleObj a18 = new MoviePeopleObj(17, "Josh Brolin","Actor", "Deadpool 2- Cable");
		MoviePeopleObj a19 = new MoviePeopleObj(18, "Briana Hildebrand","Actor", "Deadpool 2- Negasonic Teenage Warhead");
		MoviePeopleObj a20 = new MoviePeopleObj(19, "Stefan Kapisic","Actor", "Deadpool 2- Colussus(voice)");
		
		MoviePeopleObj a21 = new MoviePeopleObj(20, "Rami Malek","Actor", "Bohemian Rhapsody- Freddie Mercury");
		MoviePeopleObj a22 = new MoviePeopleObj(21, "Gwilym Lee","Actor", "Bohemian Rhapsody- Brian May");
		MoviePeopleObj a23 = new MoviePeopleObj(22, "Ben Hardy","Actor", "Bohemian Rhapsody- Roger Taylor");	
		MoviePeopleObj a24 = new MoviePeopleObj(23, "Joe Mazzelo","Actor", "Bohemian Rhapsody- John Deacon");
		
		MoviePeopleObj a25 = new MoviePeopleObj(24, "Colin Firth","Actor", "Kingsman: The Golden Circle- Harry Hart");
		MoviePeopleObj a26 = new MoviePeopleObj(25, "Julianne Moore","Actor", "Kingsman: The Golden Circle- Poppy");
		MoviePeopleObj a27 = new MoviePeopleObj(26, "Taron Egerton","Actor", "Kingsman: The Golden Circle- Eggsy");
		MoviePeopleObj a28 = new MoviePeopleObj(27, "Mark Strong","Actor", "Kingsman: The Golden Circle- Merlin");
		MoviePeopleObj a29 = new MoviePeopleObj(28, "Channing Tatum","Actor", "Kingsman: The Golden Circle- Tequila");
		
		MoviePeopleObj a30 = new MoviePeopleObj(29, "Michael Shannon","Actor", "12 Strong- Hal Spencer");
		MoviePeopleObj a31 = new MoviePeopleObj(30, "Michael Pena","Actor", "12 Strong- Sam Diler");
		MoviePeopleObj a32 = new MoviePeopleObj(31, "Trevante Rhodes","Actor", "12 Strong- Ben Milo");
		MoviePeopleObj a33 = new MoviePeopleObj(32, "Navid Negbahn","Actor", "12 Strong- Gen. Dostum");
		
		MoviePeopleObj a34 = new MoviePeopleObj(31, "Shameik Moore","Actor", "Spiderman: Into the Spiderverse- Miles Morales");
		MoviePeopleObj a35 = new MoviePeopleObj(32, "Jake Johnson","Actor", "Spiderman: Into the Spiderverse- Peter B.Parker/Spider Man");
		MoviePeopleObj a36 = new MoviePeopleObj(33, "Hailee Steinfield","Actor", "Spiderman: Into the Spiderverse- Gwen Stacy/Spider Woman");
		MoviePeopleObj a37 = new MoviePeopleObj(34, "Anna Kendrick","Actor", "The Accountant- Dana Cummings");
	
		MoviePeopleObj a38 = new MoviePeopleObj(35, "Fionn Whitehead","Actor", "Dunkirk- Tommy");
		MoviePeopleObj a39 = new MoviePeopleObj(36, "Tom Glynn Carney","Actor", "Dunkirk- Peter");
		MoviePeopleObj a40 = new MoviePeopleObj(37, "Jack Lowden","Actor", "Dunkirk- Collins");
	    MoviePeopleObj a41 = new MoviePeopleObj(38, "Harry Styles","Actor", "Dunkirk- Alex");
	
	    MoviePeopleObj a42 = new MoviePeopleObj(39, "Andrew Garfield","Actor", "Hacksaw Ridge- Desmond Doss");
		MoviePeopleObj a43 = new MoviePeopleObj(40, "Richard Pyros","Actor", "Hacksaw Ridge- Teach");
		MoviePeopleObj a44 = new MoviePeopleObj(41, "Vince Vaughn","Actor", "Hacksaw Ridge- Sgt. Howell");
		MoviePeopleObj a45 = new MoviePeopleObj(42, "Sam Worthington","Actor", "Hacksaw Ridge- Cpt. Golver");
		MoviePeopleObj a46 = new MoviePeopleObj(43, "Ben Mingay","Actor", "Hacksaw Ridge- Grease Nolan");
	
		MoviePeopleObj a47 = new MoviePeopleObj(44, "Robert De Niro","Actor", "Joker- Murray Franklin");
		MoviePeopleObj a48 = new MoviePeopleObj(45, "Frances Conoy","Actor", "Joker- Penny Fleck");
		MoviePeopleObj a49 = new MoviePeopleObj(46, "Matt Damon","Actor", "The Martian- Mark Watney");
		MoviePeopleObj a50 = new MoviePeopleObj(47, "Jessica Chastain","Actor", "The Martian- Melissa Lewis");
		MoviePeopleObj a51 = new MoviePeopleObj(48, "Jeff Daniels","Actor", "The Martian- Teddy Sanders");
		MoviePeopleObj a52 = new MoviePeopleObj(49, "Kristen Wiig","Actor", "The Martian- Annie Montrose");
		MoviePeopleObj a53 = new MoviePeopleObj(50, "Sean Bean","Actor", "The Martian- Mitch Henderson");
	
		MoviePeopleObj a54 = new MoviePeopleObj(51, "Ben Affleck","Actor", "The Accountant- Christian Wolff");
		MoviePeopleObj a55 = new MoviePeopleObj(52, "J.K. Simmons","Actor", "The Accountant- Ray King, Kung Fu Panda 3- Kai(voice)");
		MoviePeopleObj a56 = new MoviePeopleObj(53, "Jon Bernthal","Actor", "The Accountant- Brax");
		MoviePeopleObj a57 = new MoviePeopleObj(54, "Lady Gaga","Actor", "A Star is Born- Ally");
		MoviePeopleObj a58 = new MoviePeopleObj(55, "Sam Elliot","Actor", "A Star is Born -Bobby");
		MoviePeopleObj a59 = new MoviePeopleObj(56, "Dave Chappelle","Actor", "A Star is Born- George Stone");
		
		MoviePeopleObj a60 = new MoviePeopleObj(57, "Dwayne Johnson", "Actor", "Moana- Maui");
		MoviePeopleObj a61 = new MoviePeopleObj(58, "Auli Cravalho", "Actor", "Moana- Moana");
		MoviePeopleObj a62 = new MoviePeopleObj(59, "Rachel House", "Actor", "Moana- Gramma Tala");
		MoviePeopleObj a63 = new MoviePeopleObj(60, "Temuera Morrison", "Actor", "Moana- Chief Tui");

		MoviePeopleObj a64 = new MoviePeopleObj(61, "Craig T. Nelson", "Actor", "Incredibles 2 - Mr. Incredible/Bob Parr");
		MoviePeopleObj a65 = new MoviePeopleObj(62, "Holly Hunter", "Actor", "Incredibles 2- Helen Parr/Elastigirl ");
		MoviePeopleObj a66 = new MoviePeopleObj(63, "Sarah Vowell", "Actor", "Incredibles 2- Violet Parr");
		MoviePeopleObj a67 = new MoviePeopleObj(64, "Huck Milner", "Actor", "Incredibles 2- Dash Parr");

		MoviePeopleObj a68 = new MoviePeopleObj(65, "John C. Reilly", "Actor", "Ralph Breaks the Internet- Ralph");
		MoviePeopleObj a69 = new MoviePeopleObj(66, "Sarah Silverman", "Actor", "Ralph Breaks the Internet - Vanellope");

		MoviePeopleObj a70 = new MoviePeopleObj(67, "Adam Sandler", "Actor", "Hotel Transylvania 3- Dracula");
		MoviePeopleObj a71 = new MoviePeopleObj(68, "Selena Gomez", "Actor", "Hotel Transylvania 3- Mavis");
		MoviePeopleObj a72 = new MoviePeopleObj(69, "Andy Samberg", "Actor", "Hotel Transylvania 3- Johnny");

		MoviePeopleObj a73 = new MoviePeopleObj(70, "Jack Black", "Actor", "Kung Fu Panda 3- Po(voice)");
		MoviePeopleObj a74 = new MoviePeopleObj(71, "Bryan Cranston", "Actor", "Kung Fu Panda 3- Li(voice)");
		MoviePeopleObj a75 = new MoviePeopleObj(72, "Dustin Hoffman", "Actor", "Kung Fu Panda 3- Shifu(voice)");
		MoviePeopleObj a76 = new MoviePeopleObj(73, "Angelina Jolie", "Actor", "Kung Fu Panda 3- Tigress(voice)");

		MoviePeopleObj a78 = new MoviePeopleObj(74, "Will Arnett", "Actor", "Lego Batman - Batman/Bruce Wayne");
		MoviePeopleObj a79 = new MoviePeopleObj(75, "Michael Cera", "Actor", "Lego Batman- Robin/Dick Grayson");
		MoviePeopleObj a80 = new MoviePeopleObj(76, "Zach Galifianakis", "Actor", "Lego Batman - The Joker");
		MoviePeopleObj a81 = new MoviePeopleObj(77, "Rosario Dawson", "Actor", "Lego Batman- Batgirl/Barbara Gordon");

		MoviePeopleObj a82 = new MoviePeopleObj(78, "James McAvoy", "Actor", "Split- Dennis / Patricia / Hedwig / The Beast / Kevin Wendell Crumb / Barry / Orwell / Jade");
		MoviePeopleObj a83 = new MoviePeopleObj(79, "Anya Taylor-Joy", "Actor", "Split- Casey Cooke");
		MoviePeopleObj a84 = new MoviePeopleObj(80, "Betty Buckley", "Actor", "Split- Dr. Karen Fletcher");

		MoviePeopleObj a85 = new MoviePeopleObj(81, "Vera Farmiga", "Actor", "Conjuring 2- Lorraine Warren");
		MoviePeopleObj a86 = new MoviePeopleObj(82, "Frances O' Connor", "Actor", "Conjuring 2- Peggy Hodgson");

		MoviePeopleObj a87 = new MoviePeopleObj(83, "Sandra Bullock", "Actor", "Bird Box- Malorie");
		MoviePeopleObj a88 = new MoviePeopleObj(84, "Vivien Lyra Blair", "Actor", "Bird Box- Girl");
		MoviePeopleObj a89 = new MoviePeopleObj(85, "Julian Edwards", "Actor", "Bird Box- Boy");

		MoviePeopleObj a90 = new MoviePeopleObj(86, "Dane DeHaan", "Actor", "Cure for Wellness- Lockhart");
		MoviePeopleObj a91 = new MoviePeopleObj(87, "Jason Isaacs", "Actor", "Cure for Wellness- Volmer");
		MoviePeopleObj a92 = new MoviePeopleObj(88, "Mia Goth", "Actor", "Cure for Wellness- Hannah");

		MoviePeopleObj a93 = new MoviePeopleObj(89, "Garance Marillier", "Actor", "Raw- Justine");
		MoviePeopleObj a94 = new MoviePeopleObj(90, "Ella Rumpf", "Actor", "Raw- Alexia");
		
		MoviePeopleObj a95 = new MoviePeopleObj(91, "Toni Collette", "Actor", "Hereditary- Annie");
		MoviePeopleObj a96 = new MoviePeopleObj(92, "Alex Wolff", "Actor", "Hereditary- Peter");
		MoviePeopleObj a97 = new MoviePeopleObj(93, "Milly Shapiro", "Actor", "Hereditary- Charlie");
		MoviePeopleObj a98 = new MoviePeopleObj(94, "Ann Dowd", "Actor", "Hereditary- Joan");

		MoviePeopleObj a99 = new MoviePeopleObj(95, "Jamie Lee Curtis", "Actor", "Halloween- Laurie Strode");
		MoviePeopleObj a100 = new MoviePeopleObj(96, "Judy Greer", "Actor", "Halloween- Karen");
		MoviePeopleObj a101 = new MoviePeopleObj(97, "Andi Matichak", "Actor", "Halloween- Allyson");
		MoviePeopleObj a102 = new MoviePeopleObj(98, "Nick Castle", "Actor", "Halloween- Michael Myers");
		
		MoviePeopleObj a103 = new MoviePeopleObj(99, "Aiden Ehrenreich", "Actor", "Solo:A Star Wars Story- Han Solo");
		MoviePeopleObj a104 = new MoviePeopleObj(100, "Joonas Suotamo", "Actor", "Solo:A Star Wars Story- Chewbacca");
		MoviePeopleObj a105 = new MoviePeopleObj(101, "Donad Glover", "Actor", "Solo:A Star Wars Story- Lando Calrissian");
		MoviePeopleObj a106= new MoviePeopleObj(102, "Emilia Clarke", "Actor", "Solo:A Star Wars Story- Qi'ra");
		MoviePeopleObj a107 = new MoviePeopleObj(103, "Woody Harrelson", "Actor", "Solo:A Star Wars Story- Beckett");
		
		MoviePeopleObj a108 = new MoviePeopleObj(104, "Felicity Jones", "Actor", "Rogue One:A Star Wars Story- Jyn Erso");
		MoviePeopleObj a109 = new MoviePeopleObj(105, "Diego Luna", "Actor", "Rogue One:A Star Wars Story- Cassian Andor");
		MoviePeopleObj a110 = new MoviePeopleObj(106, "Ben  Mendelsohn", "Actor", "Rogue One:A Star Wars Story- Director Orson Krennic, Ready Player One- Sorrento");
		MoviePeopleObj a111 = new MoviePeopleObj(107, "Mads Mikkelsen", "Actor", "Rogue One:A Star Wars Story- Galen Erso");
		MoviePeopleObj a112 = new MoviePeopleObj(108, "Donnie Yen", "Actor", "Rogue One:A Star Wars Story- Chirrut Imwe");
		
		MoviePeopleObj a113 = new MoviePeopleObj(109, "Jennifer Lawerence", "Actor", "Passengers -Aurora Lane");
		MoviePeopleObj a114 = new MoviePeopleObj(110, "Michael Sheen", "Actor", "Passengers -Arthur");
		
		MoviePeopleObj a115 = new MoviePeopleObj(111, "Tye Sheridan", "Actor", "Ready Player One- Parzival/Wade");
		MoviePeopleObj a116 = new MoviePeopleObj(112, "Olivia Cooke", "Actor", "Ready Player One- Art3mis/Samantha");
		MoviePeopleObj a117 = new MoviePeopleObj(113, "Lena Waithe", "Actor", "Ready Player One- Aech/Helen");
		MoviePeopleObj a118 = new MoviePeopleObj(114, "T.J. Miller", "Actor", "Ready Player One- I-R0k");
		
		MoviePeopleObj a119 = new MoviePeopleObj(115, "Michael Fassbender", "Actor", "Alien Covenant- David/Walter");
		MoviePeopleObj a120 = new MoviePeopleObj(116, "Katherine Waterston", "Actor", "Alien Covenant- Daniels");
		MoviePeopleObj a121 = new MoviePeopleObj(117, "Billy Crudup", "Actor", "Alien Covenant- Oram");
		MoviePeopleObj a122 = new MoviePeopleObj(118, "Danny McBride", "Actor", "Alien Covenant- Tennessee");
		
		MoviePeopleObj a123 = new MoviePeopleObj(119, "Harrison Ford", "Actor", "Blade Runner 2049- Rick Deckard");
		MoviePeopleObj a124 = new MoviePeopleObj(120, "Ryan Gosling", "Actor", "Blade Runner 2049- 'K'");
		MoviePeopleObj a125 = new MoviePeopleObj(121, "Ana de Armas", "Actor", "Blade Runner 2049- Joi");
		MoviePeopleObj a126 = new MoviePeopleObj(122, "Sylvia Hoeks", "Actor", "Blade Runner 2049- Luv");
		MoviePeopleObj a127 = new MoviePeopleObj(123, "Robin Wright", "Actor", "Blade Runner 2049- Lt. Joshi");
		
		MoviePeopleObj a128 = new MoviePeopleObj(124, "Bryce Dallas Howard", "Actor", "Jurassic World: Fallen Kingdom- Claire Dearing");
		MoviePeopleObj a129 = new MoviePeopleObj(125, "Rafe Spall", "Actor", "Jurassic World: Fallen Kingdom- Eli Mills");
		MoviePeopleObj a130 = new MoviePeopleObj(126, "BD Wong", "Actor", "Jurassic World: Fallen Kingdom- Dr. Wu");
		MoviePeopleObj a131 = new MoviePeopleObj(127, "Jeff Goldblum", "Actor", "Jurassic World: Fallen Kingdom- Ian Malcolm");
		
		MoviePeopleObj a132 = new MoviePeopleObj(128, "Tom Hanks", "Actor", "Toy Story 4- Woody");
		MoviePeopleObj a133 = new MoviePeopleObj(129, "Tim Allen", "Actor", "Toy Story 4- Buzz Lightyear");
		MoviePeopleObj a134 = new MoviePeopleObj(130, "Annie Potts", "Actor", "Toy Story 4- Bo Peep");
		MoviePeopleObj a135 = new MoviePeopleObj(131, "Tony Hale", "Actor", "Toy Story 4- Forky");
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		list.add(a7);
		list.add(a8);
		list.add(a9);
		list.add(a10);
		list.add(a11);
		list.add(a12);
		list.add(a13);
		list.add(a14);
		list.add(a15);
		list.add(a16);
		list.add(a17);
		list.add(a18);
		list.add(a19);
		list.add(a20);
		list.add(a21);
		list.add(a22);
		list.add(a23);
		list.add(a24);
		list.add(a25);
		list.add(a26);
		list.add(a27);
		list.add(a28);
		list.add(a29);
		list.add(a30);
		list.add(a31);
		list.add(a32);
		list.add(a33);
		list.add(a34);
		list.add(a35);
		list.add(a36);
		list.add(a37);
		list.add(a38);
		list.add(a39);
		list.add(a40);
		list.add(a41);
		list.add(a42);
		list.add(a43);
		list.add(a44);
		list.add(a45);
		list.add(a46);
		list.add(a47);
		list.add(a48);
		list.add(a49);
		list.add(a50);
		list.add(a51);
		list.add(a52);
		list.add(a53);
		list.add(a54);
		list.add(a55);
		list.add(a56);
		list.add(a57);
		list.add(a58);
		list.add(a59);
		list.add(a60);
		list.add(a61);
		list.add(a62);
		list.add(a63);
		list.add(a64);
		list.add(a65);
		list.add(a66);
		list.add(a67);
		list.add(a68);
		list.add(a69);
		list.add(a70);
		list.add(a71);
		list.add(a72);
		list.add(a73);
		list.add(a74);
		list.add(a75);
		list.add(a76);
		list.add(a78);
		list.add(a79);
		list.add(a80);
		list.add(a81);
		list.add(a82);
		list.add(a83);
		list.add(a84);
		list.add(a85);
		list.add(a86);
		list.add(a87);
		list.add(a88);
		list.add(a89);
		list.add(a90);
		list.add(a91);
		list.add(a92);
		list.add(a93);
		list.add(a94);
		list.add(a95);
		list.add(a96);
		list.add(a97);
		list.add(a98);
		list.add(a99);
		list.add(a100);
		list.add(a101);
		list.add(a102);
		list.add(a103);
		list.add(a104);
		list.add(a105);
		list.add(a106);
		list.add(a107);
		list.add(a108);
		list.add(a109);
		list.add(a110);
		list.add(a111);
		list.add(a112);
		list.add(a113);
		list.add(a114);
		list.add(a115);
		list.add(a116);
		list.add(a117);
		list.add(a118);
		list.add(a119);
		list.add(a120);
		list.add(a121);
		list.add(a122);
		list.add(a123);
		list.add(a124);
		list.add(a125);
		list.add(a126);
		list.add(a127);
		list.add(a128);
		list.add(a129);
		list.add(a130);
		list.add(a131);
		list.add(a132);
		list.add(a133);
		list.add(a134);
		list.add(a135);
		
		//Directors
		MoviePeopleObj d1 = new MoviePeopleObj(132, "James Wan", "Director", "Aquaman, Conjuring 2");
		MoviePeopleObj d2 = new MoviePeopleObj(133, "Ridley Scott", "Director", "The Martian, Alien: Covenant");
		MoviePeopleObj d3 = new MoviePeopleObj(134, "John Stahelski", "Director", "John Wick 2");
		MoviePeopleObj d4 = new MoviePeopleObj(135, "Ruben Fleischer", "Director", "Venom");
		MoviePeopleObj d5 = new MoviePeopleObj(136, "Matthew Vaughn", "Director", "Kingsman: The Golden Circle");
		MoviePeopleObj d6 = new MoviePeopleObj(137, "David Leitch", "Director", "Deadpool 2");
		MoviePeopleObj d7 = new MoviePeopleObj(138, "Rodney Rotham", "Director", "Spiderman: Into the Spiderverse");
		MoviePeopleObj d8 = new MoviePeopleObj(139, "Nicolai Fuglsig", "Director", "12 Strong");
		
		MoviePeopleObj d9 = new MoviePeopleObj(140, "Bryan Singer", "Director", "Bohemian Rhapsody");
		MoviePeopleObj d10 = new MoviePeopleObj(141, "Todd Philips", "Director", "Joker");
		MoviePeopleObj d11 = new MoviePeopleObj(142, "Chirstopher Nolan", "Director", "Dunkirk");
		MoviePeopleObj d12 = new MoviePeopleObj(143, "Mel Gibson", "Director", "Hacksaw Ridge");
		MoviePeopleObj d13 = new MoviePeopleObj(144, "Bradley Cooper", "Director/Actor", "A Star is Born- Jack");
		MoviePeopleObj d14 = new MoviePeopleObj(145, "Gavin O'Connor", "Director", "The Accountant");
		
		MoviePeopleObj d15 = new MoviePeopleObj(146, "Ron Clements", "Director", "Moana");
		MoviePeopleObj d16 = new MoviePeopleObj(147, "Rich Moore", "Director", "Ralph Breaks the Internet");
		MoviePeopleObj d17 = new MoviePeopleObj(148, "Jennifer Yu Nelson", "Director", "Kung Fu Panda 3");
		MoviePeopleObj d18 = new MoviePeopleObj(149, "Genndy Tartatovsky", "Director", "Hotel Transylvania 3:Summer Vaction");
		MoviePeopleObj d19 = new MoviePeopleObj(150, "Tom Cooley", "Director", "Toy Story 4");
		MoviePeopleObj d20 = new MoviePeopleObj(151, "Chris McKay", "Director", "The Lego Batman Movie");
		MoviePeopleObj d21 = new MoviePeopleObj(152, "Brad Bird", "Director", "Incredibles 2");
		
		MoviePeopleObj d22 = new MoviePeopleObj(153, "M. Night Shamaylan", "Director", "Split");
		MoviePeopleObj d23 = new MoviePeopleObj(154, "Susanne Bier", "Director", "Bird Box");
		MoviePeopleObj d24 = new MoviePeopleObj(155, "Gore Verbinski", "Director", "A Cure For Wellness");
		MoviePeopleObj d25 = new MoviePeopleObj(156, "Julia Ducournau", "Director", "Raw");
		MoviePeopleObj d26 = new MoviePeopleObj(157, "Ari Aster", "Director", "Hereditary");
		MoviePeopleObj d27 = new MoviePeopleObj(158, "David Gordon Green", "Director", "Halloween(2018)");
		
		MoviePeopleObj d28 = new MoviePeopleObj(159, "Ron Howard", "Director", "Solo: A Star Wars Story");
		MoviePeopleObj d29 = new MoviePeopleObj(160, "Gareth Edwards", "Director", "Rogue One:A Star Wars Story");
		MoviePeopleObj d30 = new MoviePeopleObj(161, "Morten Tyldum", "Director", "Passengers");
		MoviePeopleObj d31 = new MoviePeopleObj(162, "Steven Spielberg", "Director", "Ready Player One");
		MoviePeopleObj d32 = new MoviePeopleObj(163, "Denis Villeneuve", "Director", "Blade Runner 2049");
		MoviePeopleObj d33 = new MoviePeopleObj(164, "J.A. Boyona", "Director", "Jurassic World: Fallen Kingdom");
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		list.add(d6);
		list.add(d7);
		list.add(d8);
		list.add(d9);
		list.add(d10);
		list.add(d11);
		list.add(d12);
		list.add(d13);
		list.add(d14);
		list.add(d15);
		list.add(d16);
		list.add(d17);
		list.add(d18);
		list.add(d19);
		list.add(d20);
		list.add(d21);
		list.add(d22);
		list.add(d23);
		list.add(d24);
		list.add(d25);
		list.add(d26);
		list.add(d27);
		list.add(d28);
		list.add(d29);
		list.add(d30);
		list.add(d31);
		list.add(d32);
		list.add(d33);
		
		for(MoviePeopleObj p:list) {
			System.out.println(p.name + ", " + p.position + ", " + p.featuredMovies);
			System.out.println();	
		}
	}
}
