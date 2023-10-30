package com.xworkz.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDTOMain {

	public static void main(String[] args) {
		System.out.println("invoking main in Country Runner...");
		CountryDTO dto1=new CountryDTO(1, "Afghanistan", "Kabul", 42239854, true, LocalDate.of(1919, 7, 19), 34, "Sunni Islam", "Snow leopard", "Afghan snowfinch", "Buzkashi", "Abdullah");
        CountryDTO dto2=new CountryDTO(2, "Albania", "Tirana", 	2832439, true, LocalDate.of(1912, 11, 28), 12, "Islam", "lion", "Aquila chrysaetos", "Soccer", "Edi Rama");
        CountryDTO dto3=new CountryDTO(3, "Algeria", "Algiers", 45606480, true, LocalDate.of( 1962, 7, 5), 48, "Sunni Muslims", "Fennec fox ", "Barbary Partridge", "football", "Ahmed Ouyahia");
        CountryDTO dto4=new CountryDTO(4, "Andorra", "Andorra la Vella",80088, true, LocalDate.of(1278, 9, 8), 10, "Roman Catholicism", "Brown Bear", "Partridge", "football", "Abdelmadjid Tebboune");
        CountryDTO dto5=new CountryDTO(5, "Angola", "Luanda", 	36684202, false, LocalDate.of( 1975, 11, 11), 18, "Christianity", "Giant Sable Antelope", "Red-crested turaco", "football", " Joao Lourenco");
        CountryDTO dto6=new CountryDTO(6, "Antigua and Barbuda", "Saint John's", 94298, true, LocalDate.of( 1981, 11, 1), 6, "Christianity", " Hawksbill Turtle", "Magnificent frigatebird", "Cricket", "Gaston Browne");
        CountryDTO dto7=new CountryDTO(7, "Argentina", "Buenos Aires", 45773884, false, LocalDate.of( 1816, 7, 9), 23, "Christianity", " Rufous Hornero", "Rufous hornero", "football", "Alberto Fernández");
        CountryDTO dto8=new CountryDTO(8, "Armenia", "Yerevan",2777970, true, LocalDate.of( 1991, 9, 21), 11, "Christianity", "Armenian Highland Cattle", "Armenian gull", "Wrestling", "Nikol Pashinyan");
        CountryDTO dto9=new CountryDTO(9, "Australia", "Canberra", 26439111, false, LocalDate.of( 1901, 1, 1), 6, "Christianity", "Kangaroo", "Emu", "Cricket", "Scott Morrison");
        CountryDTO dto10=new CountryDTO(10, "Austria", "Vienna",8958960, true, LocalDate.of( 1955, 9, 26), 9, "Roman Catholic", " Austrian Eagle", "Barn swallow ", "football", "Sebastian Kurz");
        CountryDTO dto11=new CountryDTO(11, "Azerbaijan", "Baku", 10412651, true, LocalDate.of( 1991, 9, 18), 66, "Shia Muslims", "Karabakh Horse", "Equus ferus caballus", "Gulesh", "Ali Asadov ");
        CountryDTO dto12=new CountryDTO(12, " The Bahamas", "Nassau", 412623, true, LocalDate.of( 1973, 6, 10), 31, "Christianity", "Blue Marlin", "Flamingo", "Cricket", "Hubert Minnis");
        CountryDTO dto13=new CountryDTO(13, "Bahrain", "Manama",1485509, false, LocalDate.of(1971,8,15), 11, "Shia Muslim", "Arabian Horse", "Phoenicopterus", "football", "Salman bin Hamad Al Khalifa ");
        CountryDTO dto14=new CountryDTO(14, "Bangladesh", "Dhaka", 	172954319, true, LocalDate.of( 1971, 3, 26), 8, "Sunni Muslim", "Royal Bengal Tiger", "Oriental magpie-robin", "Cricket", "Sheikh Hasina");
        CountryDTO dto15=new CountryDTO(15, "Barbados", "Bridgetown",281995, true, LocalDate.of( 1966, 11, 30), 11, "Christianity", "Barbados Green Monkey", "Copsychus saularis", "Cricket", " Mia Mottley");
        CountryDTO dto16=new CountryDTO(16, "Belarus", "Minsk",9498238, false, LocalDate.of( 1990, 7, 27), 6, "Buddhism", "European Bison", "White stork", "Ice Hockey", "Alexander Lukashenko");
        CountryDTO dto17=new CountryDTO(17, "Belgium", "Brussels",11686140, true, LocalDate.of( 1831, 7, 21), 3, "catholic", "Lion", "Ciconia ciconi", "Soccer", "Alexander De Croo");
        CountryDTO dto18=new CountryDTO(18, "Belize", "Belmopan", 410825, false, LocalDate.of( 1981, 8, 21), 6, "Christianity", "Baird's Tapir", "Keel-billed toucan", "football", "John Briceno");
        CountryDTO dto19=new CountryDTO(19, "Benin", "Porto-Novo", 13712828, true, LocalDate.of( 1960, 8, 1), 12, "Christianity", "African Lion", "Ramphastos", "football", "Patrice Talon ");
        CountryDTO dto20=new CountryDTO(20, "Bhutan", "Thimphu",787424, true, LocalDate.of( 1910, 3, 8), 20, "Vajrayana Buddhism", "Takin", "Raven", "Archery", "Lotay Tshering");
        CountryDTO dto21=new CountryDTO(21, "Bolivia", "La Paz",12388571, false, LocalDate.of( 1825, 8, 6), 9, "Christianity", "Andean Condor", "Andean condor ", "football", "Luis Arce");
        CountryDTO dto22=new CountryDTO(22, "Bosnia and Herzegovina", "Sarajevo", 3210847, true, LocalDate.of( 1992, 3, 1), 2, "Orthodox", "Eurasian Wolf", "Vultur", "football", " Zoran Tegeltija");
        CountryDTO dto23=new CountryDTO(23, "Botswana", "Gaborone", 2675352, true, LocalDate.of( 1996, 8, 30), 10, "Christianity", "Zebra", "gryphus", "football", " Mokgweetsi Masisi ");
        CountryDTO dto24=new CountryDTO(24, "Brazil", "Brasilia", 216422446, false, LocalDate.of( 1822, 8, 7), 26, "Christianity", "Jaguar", "Rufous-bellied thrush", "football", "Jair Bolsonaro");
        CountryDTO dto25=new CountryDTO(25, "Brunei", "Bandar Seri Begawan",452524, true, LocalDate.of( 1984, 1, 1), 4, "Islam", "Sultan's Fish", "Turdus rufiventris", "Sepak Takraw","Hassanal Bolkiah");
        CountryDTO dto26=new CountryDTO(26, "Bulgaria", "Sofia",6687717, true, LocalDate.of( 1878, 3, 3), 28, "Christianity", "Lion", "Eurasian skylark", "football", "Boyko Borissov");
        CountryDTO dto27=new CountryDTO(27, "Burkina Faso", "Ouagadougou",23251485, true, LocalDate.of( 1960, 8, 5), 13, "Islam", "Lion", "Alauda arvensis", "football", "Christophe Joseph Marie Dabire");
        CountryDTO dto28=new CountryDTO(28, "Burundi", "Bujumbura",13238559, true, LocalDate.of( 1962, 7, 1), 18, "Christianity", "Lion", "Thaumatibis", "football", "Alain-Guillaume Bunyoni");
        CountryDTO dto29=new CountryDTO(29, "Cabo Verde", "Praia",	598682, false, LocalDate.of( 1975, 7, 5), 22, "Christianity", "Lion", "gigantea", "football", "Ulisses Correia e Silva");
        CountryDTO dto30=new CountryDTO(30, "Cambodia", "Phnom Penh", 16944826, true, LocalDate.of( 1953, 11, 9), 25, "Theravada Buddhism", "Kouprey", "Giant ibis", "Bokator", "Hun Sen");
        CountryDTO dto31=new CountryDTO(31, "Cameroon", "Yaounde",28647293, true, LocalDate.of( 1960, 1, 1), 10, "Christianity", "Lion", "Gavia", "football", "Joseph Dion Ngute");
        CountryDTO dto32=new CountryDTO(32, "Canada", "Ottawa", 38781291, true, LocalDate.of( 1960, 7, 1), 10, "Taoism", "North American Beaver", "Common loon", "Ice Hockey", "Justin Trudeau");
        CountryDTO dto33=new CountryDTO(33, "Central African Republic", "Bangui", 5742315, true, LocalDate.of( 1960, 8, 13), 16, "Christianity", "African Elephant", "immer", "football", "Firmin Ngrebada");
        CountryDTO dto34=new CountryDTO(34, "Chad", "N'Djamena",18278568, true, LocalDate.of(1960, 8, 11), 23, "Sunni Muslims", "African Lion", "Grus ", "football", "Albert Pahimi Padacke");
        CountryDTO dto35=new CountryDTO(35, "Chile", "Santiago",19629590, true, LocalDate.of( 1818,8,18), 16, " Roman Catholic", "Andean Condor", "Andean condor", "football", "Sebastian Pinera");
        CountryDTO dto36=new CountryDTO(36, "China", "Beijing", 1425671352, false, LocalDate.of(1949,10,1), 23, "Buddhism", "Giant Panda", "Red-crowned crane", "Table Tennis", "Xi Jinping");
        CountryDTO dto37=new CountryDTO(37, "Colombia", "Bogota",52085168, true, LocalDate.of( 1810,7,20), 32, "Christianity", " Andean Condor", "Andean condor", "football", "Ivan Duque Márquez");
        CountryDTO dto38=new CountryDTO(38, "Comoros", "Moroni",852075, false, LocalDate.of( 1975, 7, 6), 3, "Islam", "Lion", "japonensis", "football", "Azali Assoumani");
        CountryDTO dto39=new CountryDTO(39, "Congo (Brazzaville)", "Brazzaville",6106869, true, LocalDate.of( 1960, 8, 15), 12, "Christianity", "African Lion", "African grey parrot", "football", "Clement Mouamba");
        CountryDTO dto40=new CountryDTO(40, "Congo(Kinshasa)", "kinshasa", 6106869, false, LocalDate.of(1960, 06, 30), 25, "Christian", " Okapi", "African Fish Eagle", "Soccer", "Sama LuKonde");
		CountryDTO dto41=new CountryDTO(41, "Costa Rica", "San Jase", 5212173, true, LocalDate.of(1821, 9, 15), 7, "Catholic", "White-tailed deer", "Clay-coloured thrush", "BasketBall", "Carlos Alvarado Quesada");
		CountryDTO dto42=new CountryDTO(42, "Cote d'Ivoire", "Yamoussoukro", 28873034, false, LocalDate.of(1960, 8, 7), 14, "Muslim", "African Elephant", "Northern Bald Ibis", "Soccer", " Alassane Ouattara");
		CountryDTO dto43=new CountryDTO(43, "Croatia", "Zagreb", 4008617, true, LocalDate.of(1991, 06, 25), 5, "Catholic", "Marten (Pine Marten)", "Griffon Vulture", "Soccer", "Andrej Plenković");
		CountryDTO dto44=new CountryDTO(44, "Cuba", "Havana", 11194449, false, LocalDate.of(1902, 05, 20), 15, "Catholic", "Cuban Crocodile", " Cuban Trogon", "Baseball", "Miguel Díaz-Canel");
		CountryDTO dto45=new CountryDTO(45, "Cyprus", "Nicosia", 1260138, true, LocalDate.of(1960, 07, 16), 13, "Islam", "Cyprus Mouflon (Wild Sheep)", " Cyprus Warbler", "Soccer", "Nicos Anastasiades");
		CountryDTO dto46=new CountryDTO(46, "Czechia", "Prague", 10495295, false, LocalDate.of(1918, 10, 28), 13, "Atheist", " Double-tailed Lion", "Common Nightingale", "hockey", " Andrej Babiš");
		CountryDTO dto47=new CountryDTO(47, "Denmark", "Copenhagen", 5910913, true, LocalDate.of(1945, 05, 5), 11, "Evangelical Lutheran", "Mute Swan", "Mute Swan", "Soccer", "Mette Frederiksen");
		CountryDTO dto48=new CountryDTO(48, "Djibouti", "Djibouti", 1136455, false, LocalDate.of(1977, 06, 27), 6, "Islamic", " Somali Wild Ass", "Arabian Bustard", "Soccer", " Ismaïl Omar Guelleh");
		CountryDTO dto49=new CountryDTO(49, "Dominica", "Roseau", 73040, true, LocalDate.of(1978, 11, 3), 10, "Christian", " Sisserou Parrot (Imperial Parrot)", "Imperial Amazon Parrot", "Cricket", "Roosevelt Skerrit");
		CountryDTO dto50=new CountryDTO(50, "Dominican Republic", "Santo Domingo", 11332972, false, LocalDate.of(1844, 02, 27), 31, "Christian", "Palmchat", " Palmchat", "Baseball", "Luis Abinader");
		CountryDTO dto51=new CountryDTO(51, "East Timor", "Dili", 1360596, true, LocalDate.of(2002, 05, 20), 14, "Catholic", "  Saltwater Crocodile", " Fawn-breasted Whistler", "Soccer", "Taur Matan Ruak");
		CountryDTO dto52=new CountryDTO(52, "Ecuador", "Quito", 18190484, false, LocalDate.of(1830, 05, 13), 24, "Roman Catholic", " Andean Condor", " Andean Condor", "Soccer", "Guillermo Lasso");
		CountryDTO dto53=new CountryDTO(53, "Egypt", "Cairo", 112716598, true, LocalDate.of(1922, 02, 28), 29, "Islam", "Steppe Eagle", "Steppe Eagle", "Soccer", " Abdel Fattah el-Sisi");
		CountryDTO dto54=new CountryDTO(54, "EI Salvador", "San Salvador", 6364943, false, LocalDate.of(1821, 02, 1), 14, "Roman Catholic", "Turquoise-browed Motmot", " Turquoise-browed Motmot", "Soccer", "Nayib Bukele");
		CountryDTO dto55=new CountryDTO(55, "Equatorial Guinea", "Malabo", 1714671, true, LocalDate.of(1968, 10, 12), 8, "Roman Catholic", " Crested Porcupine", " Grey Parrot", "Soccer", "Teodoro Obiang Nguema Mbasogo");
		CountryDTO dto56=new CountryDTO(56, "Eritrea", "Asmara", 3748901, false, LocalDate.of(1991, 05, 24), 6, "Christian", "Camel", "White-cheeked Turaco", "Cycling", "Isaias Afwerki");
		CountryDTO dto57=new CountryDTO(57, "Estonia", "Tallinn", 1332765, true, LocalDate.of(1991, 8, 15), 15, "Christian", "Gray Wolf", "Barn Swallow", "Basketball", "Kaja Kallas");
		CountryDTO dto58=new CountryDTO(58, "Eswatini", "Mbabane", 1210822, false, LocalDate.of(1968, 9, 06), 4, "Christian", " Lion", "Purple-crested Turaco", "Soccer", "Mswati III ");
		CountryDTO dto59=new CountryDTO(59, "Ethiopia", "Addis Ababa", 126527060, true, LocalDate.of(1942, 01, 31), 9, "Christian", "  Lion of Judah", " Ethiopian Stork", "Long-distance running", "Abiy Ahmed");
		CountryDTO dto60=new CountryDTO(60, "Fiji", "Suva", 936375, false, LocalDate.of(1970, 10, 01), 15, "Christian", " Fijian Iguana", " Fiji Wattled Honeyeater", "Rugby union ", "Frank Bainimarama");
		CountryDTO dto61=new CountryDTO(61, "Finland", "Helsinki", 5545475, true, LocalDate.of(1917, 12, 06), 19, "Christian", "Brown Bear", "Whooper Swan", "Ice hockey ", "Sanna Marin");
		CountryDTO dto62=new CountryDTO(62, "France", "Paris", 64756584, false, LocalDate.of(1789, 07, 14), 18, "Catholicism", "Gallic Rooster (Coq Gaulois)", " Gallic Rooster (Coq Gaulois)", "Soccer", "Emmanuel Macron");
		CountryDTO dto63=new CountryDTO(63, "Gabon", "Libreville", 2436566, true, LocalDate.of(1960, 8, 17), 9, "Christian", " Black Panther (Leopard)", " African Fish Eagle", "Soccer", " Ali Bongo Ondimba");
		CountryDTO dto64=new CountryDTO(64, "The Gambia", "Banjul", 2773168, false, LocalDate.of(1965, 02, 18), 7, "Muslim", "Spur-winged Goose", " Red-necked Nightjar", "Soccer", "Adama Barrow");
		CountryDTO dto65=new CountryDTO(65, "Georgia", "Tbilisi", 3728282, true, LocalDate.of(1918, 05, 26), 50, "Christian", " Caucasian Leopard", "Golden Pheasant", "Rugby", "Irakli Garibashvili");
		CountryDTO dto66=new CountryDTO(66, "Germany", "Berlin", 83294633, false, LocalDate.of(1955, 05, 5), 16, "Christian", " Golden Eagle", "White-tailed Eagle", "Soccer", " Angela Merkel");
		CountryDTO dto67=new CountryDTO(67, "Ghana", "Accra", 34121985, true, LocalDate.of(1957, 03, 01), 16, "Christian", "  Golden Eagle", " African Fish Eagle", "Soccer", "Nana Akufo-Addo");
		CountryDTO dto68=new CountryDTO(68, "Greece", "Athens", 10341277, false, LocalDate.of(1821, 02, 21), 13, "Christian", "  Dolphin (Common Bottlenose Dolphin)", " Little Owl", "Soccer", " Kyriakos Mitsotakise");
		CountryDTO dto69=new CountryDTO(69, "Grenada", "Saint George", 126183, true, LocalDate.of(1974, 07, 7), 6, "Christian", " Grenada Dove", " Grenada Dove", "Cricket", " Keith Mitchell");
		CountryDTO dto70=new CountryDTO(70, "Guatemala", "Guatemala city", 18092026, false, LocalDate.of(1821, 9, 15), 22, "Catholic", "Quetzal", " Resplendent Quetzal", "Soccer", "Alejandro Giammattei");
		CountryDTO dto71=new CountryDTO(71, "Guinea", "Conakry", 14190612, true, LocalDate.of(1958, 10, 02), 8, "Muslim", " African Elephant", " African Fish Eagle", "Soccer", "Alpha Condé");
		CountryDTO dto72=new CountryDTO(72, "Guinea-Bissau", "Bissau", 2150842, false, LocalDate.of(1973, 9, 24), 8, "Muslim", "African Fish Eagle", " African Fish Eagle", "Soccer", "Gomes Nabiam");
		CountryDTO dto73=new CountryDTO(73, "Guyana", "Georgetown", 813834, true, LocalDate.of(1966, 05, 26), 10, "Christian", "Jaguar", " Hoatzin", "Cricket", " Irfaan Ali.");
		CountryDTO dto74=new CountryDTO(74, "Haiti", "Port-au-prince", 11724763, false, LocalDate.of(1804, 01, 01), 10, "Roman Catholic", "Hispaniolan Trogon", " Hispaniolan Trogon", "Soccer", " Ariel Henry");
		CountryDTO dto75=new CountryDTO(75, "Honduras", "Tegucigalpa", 10593798, true, LocalDate.of(1821, 9, 15), 18, "Christian", "White-tailed Deer", "Scarlet Macaw", "Soccer", "Orlando Hernández");
		CountryDTO dto76=new CountryDTO(76, "Hungary", "Budapest", 10156239, false, LocalDate.of(1956, 11, 11), 7, "Christian", "Turul (mythical bird)", "Saker Falcon", "Soccer", " Orbán");
		CountryDTO dto77=new CountryDTO(77, "Iceland", "Reykjavik", 375318, true, LocalDate.of(1944, 06, 17), 8, "Christian", "Gyrfalcon", "Gyrfalcon", "Soccer", "Katrín Jakobsdóttir");
		CountryDTO dto78=new CountryDTO(78, "India", "NewDelhi", 1428627663, false, LocalDate.of(1947, 8, 15), 28, "Hinduism", " Bengal Tiger", " Indian Peafowl (Peacock)", "Cricket", " Narendra Modi");
		CountryDTO dto79=new CountryDTO(79, "Indonesia", "Jakarta", 277534122, true, LocalDate.of(1945, 8, 17), 38, "Islam", " Komodo Dragon", " Javan Hawk-Eagle", "Badminton", "Joko Widodo");
		CountryDTO dto80=new CountryDTO(80, "Iran", "Tehran", 87590873, true, LocalDate.of(1979, 03,31), 31, "Shaia Islam", "Asiatic lion", "The niightingale", "Wrestling", "Ebrahim Raisi");
		CountryDTO dto81=new CountryDTO(81, "Iraq", "Baghdad", 43.5, true, LocalDate.of(1932, 10,3), 18, "Islam", "Goat", "Golden Eagle", "Football", "Mohammed Shia Al Sudani");
		CountryDTO dto82=new CountryDTO(82, "Ireland", "Dublin", 710052314, true, LocalDate.of(1949, 04,18), 32, "christianity", "Mountain hare", "Northern Lapwing", "Gaelic football", "Micchael D Higgins");
		CountryDTO dto83=new CountryDTO(83, "Israel", "Jerusalem", 9800000, true, LocalDate.of(1949, 05,11), 6, "Jewish", "The Gazelle", "Hoope", "Footbal(Defacto)", "Benjamin Netanyahu");
		CountryDTO dto84=new CountryDTO(84, "Italy", "Rome", 58853482, true, LocalDate.of(1958, 01,01), 1, "christianity", "The Italian Wolf", "Italian sparrow", "Football", "Giorgio Meloni");
		CountryDTO dto85=new CountryDTO(85, "Jamaica", "Kingston", 2825544, true, LocalDate.of(1962, 8,06), 14, "christianity", "Billed Streamertail", "jamica Hummingbird", "cricket", "Andrew Holness");
		CountryDTO dto86=new CountryDTO(86, "Japan", "Tokyo", 125416877, true, LocalDate.of(1947, 03,03), 47, "shinto", "snow Monkey", "Green pheasant", "Sumo", "Fumio Kishida");
		CountryDTO dto87=new CountryDTO(87, "Jordan", "Amman", 11484805, true, LocalDate.of(1952, 01,11), 12, "Sunni Islam", "Arabian oryx", "Sinai rosefinch", "footbal", "Bisher Khasaweh");
		CountryDTO dto88=new CountryDTO(88, "Kazakhstan", "Astana", 19944726, true, LocalDate.of(1995, 8,30), 14, "Islam", "horse", "Steppe Eagle", "Baigs", "Alihan Smaiylov");
		CountryDTO dto89=new CountryDTO(89, "Kenya", "Nairobi", 51526000, true, LocalDate.of(1964, 12,12), 1, "christianity", "Lion", "Lilac breasted roller", "soccer", "William Ruto");
		CountryDTO dto90=new CountryDTO(90, "Kiribati", "Tarawa", 121388, true, LocalDate.of(1979, 9,20), 21, "christianity", "Magnificent frigate", "frigate bird", "volleyball", "Taneti Maamau");
		CountryDTO dto91=new CountryDTO(91, "Korea North", "Pyongyang", 26072217, true, LocalDate.of(1971, 12,27), 9, "no religion", "no-animal", "/northerb goshawk", "footbal", "Kim Jong Un");
		CountryDTO dto92=new CountryDTO(92, "Korea South", "Seoul", 51966948, true, LocalDate.of(1988, 02,25),8, "no religion", "korean tiger", "The magpie", "Teakwondo", "Han Duck soo");
		CountryDTO dto93=new CountryDTO(93, "Kosovo", "Pristina", 1761985, true, LocalDate.of(2013, 04,19), 38, "Islam", "Balkan iynx", "turdus merula", "football", "Albin Kurti");
		CountryDTO dto94=new CountryDTO(94, "Kuwait", "KuwaitCity", 4294621, true, LocalDate.of(1961, 11,11), 6, "Islam", "Arabian camel", "Falcon", "football", "Ahmad Nawaf Al sabah");
		CountryDTO dto95=new CountryDTO(95, "Kyrgyzsran", "Bishkek", 7037590, true, LocalDate.of(1991, 12,26), 7, "Islam", "capra sibirica alaiana", "Buteo hemilasius", "equestrian", "Sadyr Japarov");
		CountryDTO dto96=new CountryDTO(96, "Laos", "Vientiane", 7749595, true, LocalDate.of(1991, 8,14), 17, "Buddhism", "Elephants", "green peafowl", "Sepak Takraw", "Sonexay siphandone");
		CountryDTO dto97=new CountryDTO(97, "Latvia", "Riga", 1842226, true, LocalDate.of(1918, 11,18), 110, "christianity", "the bear", "belta cielava", "Ice hockey", "Evika Silina");
		CountryDTO dto98=new CountryDTO(98, "Lebanon", "Beirut", 5296814, true, LocalDate.of(2005, 04,30), 6, "Islam", "Striped hyena", "Golden Eagle", "Football", "Najib Mikati");
		CountryDTO dto99=new CountryDTO(99, "Lesotho", "Maeru", 2210646, true, LocalDate.of(1966, 10,4), 10, "christianity", "Black rhinoceros", "no-bird", "football", "Sam Matekane");
		CountryDTO dto100=new CountryDTO(100, "Liberia", "Monrovia", 5506280, true, LocalDate.of(1847, 07,26), 15, "christianity", "Asiatic lion", "Garden bulbul", "footbal", "George Weah");
		CountryDTO dto101=new CountryDTO(101, "Libya", "Tripoli", 7252573, true, LocalDate.of(2020, 10,23), 3, "Islam", "Arabian Eagle", "eagle", "football", "Abdul Hamid Dbeibeh");
		CountryDTO dto102=new CountryDTO(102, "Liechtenstein", "Vaduz", 39584, true, LocalDate.of(1866,8,23), 11, "christianity", "common kestrel", "eagle", "footbal", "Daniel Risch");
		CountryDTO dto103=new CountryDTO(103, "Lithuania", "Vilnius", 2867725, true, LocalDate.of(1990, 05,1), 10, "christianity", "white stork", " gardras", "Basketball", "Ingrida Nauseda");
		CountryDTO dto104=new CountryDTO(104, "Luxembourg", "Luxembourg City", 660809, true, LocalDate.of(1958, 1,1), 12, "christianity", "red lion", "The goldcrest", "soccer", "Xavier Bettel");
		CountryDTO dto105=new CountryDTO(105, "Madagascar", "Antananarivo", 28812195, true, LocalDate.of(1960, 06,26), 23, "christianity", "The Lemur", "fish eagle", "Rugby union", "Christian Ntsay");
		CountryDTO dto106=new CountryDTO(106, "Malawi", "Lilongwe", 20091635, true, LocalDate.of(1966, 07,06), 28, "christianity", "thompsons gazelle", "african fish eagle", "football", "Lazarus hakwera");
		CountryDTO dto107=new CountryDTO(107, "Malaysia", "Kuala Lumpur", 33200000, true, LocalDate.of(1963, 9,16), 13, "Sunni Islam", "Malayan tiger", "Rhinoceros hornbill", "Sepak takraw", "Anwar Ibrahim");
		CountryDTO dto108=new CountryDTO(108, "Maldives", "Male", 521021, true, LocalDate.of(1965, 07,26), 26, "Sunni Islam", "Yellowfin tuna", "white breasted waterhen", "football", "Mohamed Muizzu");
		CountryDTO dto109=new CountryDTO(109, "Mali", "Bamako", 21359722, true, LocalDate.of(1960, 9,22), 10, "Islam", "the vulture", "the firefinch", "football", "Choguel Kokalla maiga");
		CountryDTO dto110=new CountryDTO(110, "Malta", "Valletta", 519562, true, LocalDate.of(1964, 9,21), 5, "christianity", "Pharoah Hound", "blue rock thrush", "soccer", "Robert Abela");
		CountryDTO dto111=new CountryDTO(111, "Marshall Islands", "Delap-Uliga-Djarrit", 42418, true, LocalDate.of(1986, 10,21), 29, "christianity", "Black footed Cat", "common brown noddy", "footbal", "David Kabua");
		CountryDTO dto112=new CountryDTO(112, "Mauritania", "Nouakchott", 1030000, true, LocalDate.of(1960, 11,28), 15, "Sunni Islam", "Africcan wild cat", "white crowned sparrow", "football", "Mohamed Ould Bilal");
		CountryDTO dto113=new CountryDTO(113, "Mauritius", "Port Louis", 1265475, true, LocalDate.of(1992, 03,12), 9, "Hinduism", "Sambar deer", "The Dodo", "football", "Pravid Jugnsuth");
		CountryDTO dto114=new CountryDTO(114, "Mexico", "Mexico City", 129975529, true, LocalDate.of(1917, 02,5), 32, "Roman Catholic", "golden eagle", "eagle", "Charreria", "Ana Lilia Rivera");
		CountryDTO dto115=new CountryDTO(115, "Micronesia", "Palikir", 104468, true, LocalDate.of(1986, 11,3), 4, "christianity", "Chuuk flying fox", "flyingFox", "Canoe racing", "WesleySimina");
		CountryDTO dto116=new CountryDTO(116, "Moldova", "Chisinau", 2512758, true, LocalDate.of(1991, 8,27), 5, "christianity", "The wild european bull", "The white stork", "Wrestling", "Dorin Recean");
		CountryDTO dto117=new CountryDTO(117, "Monaco", "Monaco city", 39050, true, LocalDate.of(1911, 01,5), 1, "christianity", "rabbit", "Lesser Grey Shrike", "football", "Albert II");
		CountryDTO dto118=new CountryDTO(118, "Mongolia", "Ulaanbaatar", 3227863, true, LocalDate.of(1992, 02,13), 21, "Buddhism", "Przewalskis horse", "saker falcon", "Mongolian wrestling", "Luvsannamsrain");
		CountryDTO dto119=new CountryDTO(119, "Montenegro", "Podgorica", 602445, true, LocalDate.of(2006, 06,3), 23, "christianity", "Balkan lynx", "Eurasian Griffon vulture", "Water polo", "Dritan Abazovic");
		CountryDTO dto120=new CountryDTO(120, "Morocco", "Rabat", 37134500, true, LocalDate.of(1945, 11, 18), 12, "Islam","Barbary macaque", "Northern Bald Ibis", "Football (Soccer)","Aziz Akhannouch") ;
		CountryDTO dto121=new CountryDTO(121, "Mozambique", "Maputo", 32419747, true, LocalDate.of(1975,6,25), 11, "Christianity", "African elephant","Green Coucal", "Football (Soccer)","Carlos Agostinho ") ;
		CountryDTO dto122=new CountryDTO(122, "Myanmar (Burma)", "Rangoon", 55770232, false, LocalDate.of(1948,1,4), 7, "Buddhism","Burmese peafowl", "Grey Peacock-Pheasant", "Chinlone (a traditional sport)","Min Aung Hlaing") ;
		CountryDTO dto123=new CountryDTO(123, "Namibia", "Windhoek", 2641857, true, LocalDate.of(1990,3,21), 14, "Christianity","Oryx", "Blue Crane",  "Rugby","Saara Kuugongelwa-Amadhila") ;
		CountryDTO dto124=new CountryDTO(124, "Nauru", "Yaren", 11832, true, LocalDate.of(1968,1,31), 8, "Christianity", "Nauru Reed Warbler","Nauruan coconut crab", "Australian Rules Football","Lionel Aingimea") ;
		CountryDTO dto125=new CountryDTO(125, "Nepal", "Kathmandu", 29164578, false, LocalDate.of(1979,10,27), 7, "Hinduism", "Cow","Himalayan Monal",  "Volleyball","Sher Bahadur Deuba") ;
		CountryDTO dto126=new CountryDTO(126, "Netherlands", "Amsterdam", 17948300, true, LocalDate.of(1581,7,26), 4, "Christianity", "Lion"," Black-tailed Godwit",  "Football (Soccer)","Mark Rutte") ;
		CountryDTO dto127=new CountryDTO(127, "New Zealand", "Wellington", 5223100, true, LocalDate.of(1962,6,1), 2, "Christianity", "Kiwi","Kiwi", "Rugby","Jacinda Ardern") ;
		CountryDTO dto128=new CountryDTO(128, "Nicaragua", "Managua", 6733763, true, LocalDate.of(1821,9,15), 15, "Christianity","Resplendent quetzal", " Turquoise-browed Motmot",  "Baseball","Daniel Ortega") ;
		CountryDTO dto129=new CountryDTO(129, "Niger", "Niamey", 25369415, false, LocalDate.of(1960,8,3), 7, "Christianity", "Giraffe","Dama Gazelle",  "Football (Soccer)","Ouhoumoudou Mahamadou") ;
		CountryDTO dto130=new CountryDTO(130, "Nigeria", "Abuja",216783400, true, LocalDate.of(1960,10,1), 36, "Christianity","Eagle", "Black Crowned Crane", "Football (Soccer)","Muhammadu Buhari") ;
		CountryDTO dto131=new CountryDTO(131, "North Macedonia", "Oslo", 1832696, true, LocalDate.of(1991,9,8), 8, "Islam","Eurasian lynx", "Eurasian Magpie", "Football (Soccer)","Zoran Zaev") ;
		CountryDTO dto132=new CountryDTO(132, "Norway", "Muscat", 25660000, true, LocalDate.of(1814,5,17), 10, "Christianity", "Eurasian elk (moose)","White-throated Dipper",  "Cross-Country Skiing","Erna Solberg") ;
		CountryDTO dto133=new CountryDTO(133, "Oman", "Islamabad", 5113071, false, LocalDate.of(1650,11,18), 11, "Islam","Arabian oryx", "Arabian Oryx", "Camel Racing","Haitham bin Tariq Al Said") ;
		CountryDTO dto134=new CountryDTO(134, "Pakistan", "Melekeok", 241499431, true, LocalDate.of(1947,8,14), 4, "Islam","Markhor", "Chukar Partridge", "Field Hockey"," Imran Khan") ;
		CountryDTO dto135=new CountryDTO(135, "Palau", "Ngerulmud", 16733, true, LocalDate.of(1994,10,1), 16, "Christianity", "Saltwater crocodile","Micronesian Megapode", "Baseball","Surangel Whipps Jr.") ;
		CountryDTO dto136=new CountryDTO(136, "Palestine", "Jerusalem", 5483450, false, LocalDate.of(1988,11,15), 16, "Islam", " Palestine sunbird"," Palestine Sunbird",  "Football (Soccer)","Mohammad Shtayyeh") ;
		CountryDTO dto137=new CountryDTO(137, "Panama", "Panama", 4337406, true, LocalDate.of(1821,11,28), 10, "Christianity", "Harpy eagle","Harpy Eagle",  "Baseball","Laurentino Cortizo") ;
		CountryDTO dto138=new CountryDTO(138, "Papua New Guinea", "Port Moresby", 11781559, true, LocalDate.of(1903,11,3), 20, "Christianity"," Raggiana bird-of-paradise", "Raggiana Bird-of-Paradise",  "Rugby League","Laurentino Cortizo") ;
		CountryDTO dto139=new CountryDTO(139, "Paraguay", "Asuncion", 6109644, true, LocalDate.of(1975,9,16), 17, "Christianity"," Pampas fox", "Bare-throated Bellbird", "Football (Soccer)","Mario Abdo Benítez") ;
		CountryDTO dto140=new CountryDTO(140, "Peru", "Lima", 33396698, true, LocalDate.of(1811,5,15), 25, "Christianity","Vicuna", "Andean Cock-of-the-Rock",  "Paleta Frontón (a racquet sport)","Pedro Castillo") ;
		CountryDTO dto141=new CountryDTO(141, "Philippines", "Manila",110735000, false, LocalDate.of(1821,7,28), 16, "Christianity", "Carabao (water buffalo)","Philippine Eagle",  "Arnis","Rodrigo Duterte") ;
		CountryDTO dto142=new CountryDTO(142, "Poland", "Warsaw",37691000, true, LocalDate.of(1918,11,11), 16, "Christianity","White-tailed eagle", "White-tailed Eagle",  "Football (Soccer)","Mateusz Morawiecki") ;
		CountryDTO dto143=new CountryDTO(143, "Portugal", "Lisbon", 10467366, true, LocalDate.of(1640,12,1), 18, "Christianity", "Iberian wolf","Common Nightingale",  "Football (Soccer)","Antonio Costa") ;
		CountryDTO dto144=new CountryDTO(144, "Qatar", "Doha", 2656032, true, LocalDate.of(1878,12,18), 7, "Islam","Arabian oryx", "Falcon", "Football (Soccer)","Sheikh Khalid bin Khalifa bin Abdulaziz Al Thani") ;
		CountryDTO dto145=new CountryDTO(145, "Romania", "Bucharest", 19051562, false, LocalDate.of(1971,9,3), 41, "Christianity", "Lynx","Eurasian Lark", "Oin (a traditional Romanian sport)","Nicolae Ciuc") ;
		CountryDTO dto146=new CountryDTO(146, "Russia", "Mascow", 146424729, true, LocalDate.of(1962,6,1), 89, "Christianity","Russian bear", "Double-headed Eagle", "Bandy","Mikhail Mishustin") ;
		CountryDTO dto147=new CountryDTO(147, "Rwanda", "Kigali", 13246394, true, LocalDate.of(1876,5,10), 5, "Christianity","African leopard", "African Crowned Crane","Football (Soccer)","Edouard Ngirente") ;
		CountryDTO dto148=new CountryDTO(148, "Saint Kitts and Nevis", "Basseterre", 10585, false, LocalDate.of(1918,12,1), 11, "Christianity","Brown pelican" ,"Brown Pelican",  "Cricket","Timothy Harris") ;
		CountryDTO dto149=new CountryDTO(149, "Saint Lucia", "Castries", 5651, true, LocalDate.of(1962,7,1), 12, "Christianity", " Saint Lucia parrot","Saint Lucia Parrot", "Cricket","Philip J. Pierre") ;
		CountryDTO dto150=new CountryDTO(150, "Saint Vincent and the Grenadines", "Kingstown", 6092, true, LocalDate.of(1983,9,19), 10, "Christianity"," Saint Vincent Amazon parrot", " Saint Vincent Parrot",  "Cricket","Ralph Gonsalves") ;
		CountryDTO dto151=new CountryDTO(151, "Samoa", "Apia", 2188, true, LocalDate.of(1962,6,1), 11, "Christianity","Samoan flying fox", "Mao", "Cricket","Fiame Naomi Mata") ;
		CountryDTO dto152=new CountryDTO(152, "San Marino", "San Marino", 15040, false, LocalDate.of(1962,6,1), 9, "Christianity","Italian sparrow", "No designated national bird","Football (Soccer)","Giancarlo Giorgetti" ) ;
		CountryDTO dto153=new CountryDTO(153, "Sao Tome and Principe", "Sao Tome", 305695, true, LocalDate.of(1975,6,12), 6, "Christianity","Giant sunbird", "Sao Tome Ibis",  "Football (Soccer)","Jorge Bom Jesus") ;
		CountryDTO dto154=new CountryDTO(154, "Saudi Arabia", "Riyadh", 32175224, true, LocalDate.of(1979,2,22), 13, "Islam", "Arabian horse","Arabian camel", "Football (Soccer)"," Mohammed bin Salman") ;
		CountryDTO dto155=new CountryDTO(155, "Senegal", "Dakar", 18275743, false, LocalDate.of(1960,4,4), 14, "Islam","African lion", " African Fish Eagle", "Football (Soccer)"," Macky Sall") ;
		CountryDTO dto156=new CountryDTO(156, "Serbia", "Belgrade", 6641197, true, LocalDate.of(1835,2,15), 29, "Christianity","Gray wolf", "Griffon Vulture","Basketball","Ana Brnabi") ;
		CountryDTO dto157=new CountryDTO(157, "Seychelles", "Victoria", 396801, false, LocalDate.of(1976,6,29), 26, "Christianity","Seychelles giant tortoise", " Seychelles Black Parrot",  "Volleyball","Wavel Ramkalawan") ;
		CountryDTO dto158=new CountryDTO(158, "Sierra Leone", "Freetown", 8494260, true, LocalDate.of(1961,4,27), 5, "Islam", "African leopard","White-necked Picathartes","Football (Soccer)","Julius Maada Bio") ;
		CountryDTO dto159=new CountryDTO(159, "Singapore", "Singapore", 5917600, true, LocalDate.of(1965,8,9), 5, "Buddhism","Lion", "Crimson Sunbird", "Sepak Takraw","Lee Hsien Loong") ;
        CountryDTO dto160 = new CountryDTO(160, "Slovakia","Bratislava",5795199,false,LocalDate.of(1992,7,17),79, "Christianity", "BrownBear","GoldenEagle","tennis","RobertFico");
		CountryDTO dto161 = new CountryDTO(161, "Slovenia","Ljublijana",2119675,true,LocalDate.of(1947,8,15),12, "Christianity", "Balkonhorse","WhiteStork","Basketball","RobertGolob");
		CountryDTO dto162 = new CountryDTO(162, "Solomon Islands","Honiara",740424,false,LocalDate.of(1978,7,12),9, "Christianity", "Sea turtles","Pigen","Football","Manasseh");
		CountryDTO dto163 = new CountryDTO(163, "Somalia","Mogadishu",1814337,true,LocalDate.of(1960,6,26),6, "Islam", "leopard","supreb starling","Soccer","HamzaBarre");
		CountryDTO dto164 = new CountryDTO(164, "South Africa","Pretoria",60414495,false,LocalDate.of(2011,6,9),9, "Christianity", "Springbok","blue crane","Olampic","Suid-Afrika");
		CountryDTO dto165 = new CountryDTO(165, "South Sudan","Juba",11088796,true,LocalDate.of(2011,9,9),10, "Christianity", "BrownBear","GoldenEagle","soccer","Salva Kiir Mayardit");
		CountryDTO dto166 = new CountryDTO(166, "Spain","Madrid",47519628,false,LocalDate.of(1985,7,12),17, "Christianity", "Bull","Eagle","football","Pedro Sánchez");
		CountryDTO dto167 = new CountryDTO(167, "Sri Lanka","Colomba",21893579,true,LocalDate.of(1948,2,4),25, "Buddhism", "Lion","Junglefowl","Cricket","Dinesh Gunawardena");
		CountryDTO dto168 = new CountryDTO(168, "Sudan","Kharoum",48109006,false,LocalDate.of(1956,1,1),18, "Islam", "Zebra","Secretarybird","Soccer","Hamdok");
		CountryDTO dto169 = new CountryDTO(169, "Suriname","Paramaribo",623236,true,LocalDate.of(1975,1,25),10, "Christianity", "Lesser Kiskadee","Scarlet Ibis","Soccer","Julius Caesar");
		CountryDTO dto170 = new CountryDTO(170, "Sweden","Mbabane",10612086,false,LocalDate.of(1523,6,6),25, "Christianity", "Moose","Eagle","hockey","Ulf Kristersson");
		CountryDTO dto171 = new CountryDTO(171, "Switzerland","Stockholm",8796669,true,LocalDate.of(1921,8,1),26, "Christianity", "Bear","pegien","hockey","Cassis ");
		CountryDTO dto172 = new CountryDTO(172, "Syria","Bern",23227014,false,LocalDate.of(1946,4,17),14, "Christianity", "BrownBear","ibis","Soccer ","Hussein Arnous");
		CountryDTO dto173 = new CountryDTO(173, "Taiwan","Damascus",23923276,true,LocalDate.of(1945,10,25),22, "Buddhism", "Formosan black bear"," Blue Magpie","Baseball ","Lin Chuan");
		CountryDTO dto174 = new CountryDTO(174, "Tajikistan","Taipei",10143543,false,LocalDate.of(1991,11,9),4, "Christianity", "Marco Polo sheep","Formosan","Soccer","Kokhir Rasulzoda");
		CountryDTO dto175 = new CountryDTO(175, "Tanzania","Dushanbe",67438106,true,LocalDate.of(1961,12,9),10, "Christianity", "Giraffe","Fireback","Soccer","Kassim Majaliwa");
		CountryDTO dto176 = new CountryDTO(176, "Thailand","Bangkok",71801279,false,LocalDate.of(1960,4,27),77, "Buddhism", "Elephant","Siamese Fireback","Soccer","Srettha Thavisin");
		CountryDTO dto177 = new CountryDTO(177, "Togo","Lome",9053799,true,LocalDate.of(1970,5,4),30, "Christianity", "Lion","Peregrine","Soccer","Victoire Tomegah");
		CountryDTO dto178 = new CountryDTO(178, "Tonga","Nukualofa",107773,false,LocalDate.of(1962,8,31),45, "Christianity", "Elephant","Eagle","Rugby ","Siaosi Sovaleni");
		CountryDTO dto179 = new CountryDTO(179, "Trinidad","portspain",1534937,true,LocalDate.of(1956,3,20),9, "Christianity", "Fiji fauna","Scarlet Ibis","Cricket","Keith Christopher Rowley");
		CountryDTO dto180 = new CountryDTO(180, "Tunisia","Tunis",12458223,false,LocalDate.of(1991,9,27),24, "Islam", "Camel","Wolf ","football","Ahmed Hachani");
		CountryDTO dto181 = new CountryDTO(181, "Turkey","Ankara",8575199,true,LocalDate.of(1978,7,1),81, "Islam", "Gray wolf","Wolf ","football","Banili");
		CountryDTO dto182 = new CountryDTO(182, "Turkmenistan","Ashgabat",6516100,false,LocalDate.of(1995,7,1),5, "Islam", "Bear","pengvine","Soccer","Han Ahmedow");
		CountryDTO dto183 = new CountryDTO(183, "Tuvalu","Vaiaku",11396,true,LocalDate.of(1945,5,12),6, "Christianity", "dolphin","Lapwing","football ","Kausea Natano");
		CountryDTO dto184 = new CountryDTO(184, "Uganda","Kampala",48582334,false,LocalDate.of(1962,10,9),111, "Christianity", "Uganda Kob","Grey Crowned Crane","Soccer ","Robinah Nabbanja");
		CountryDTO dto185 = new CountryDTO(185, "Ukraine","Kyiv",36744634,true,LocalDate.of(1991,8,27),24, "Christianity", "WorldAtlas","crane","Soccer ","Denys");
		CountryDTO dto186 = new CountryDTO(186, "United Arab Emirates","Abudhabi",9516871,false,LocalDate.of(1971,12,2),7, "Islam", "Peregrine","Peregrine Falcon","Soccer ","Sheikh Mohammed");
		CountryDTO dto187 = new CountryDTO(187, "United Kingdom","Londan",67736802,true,LocalDate.of(1776,5,4),4, "Christianity", "Lion","European Robin","camel racing","Rishi");
		CountryDTO dto188 = new CountryDTO(188, "United States","washington",33999656,false,LocalDate.of(1885,7,12),50, "Hindhu", "Bison","Baldeagle","Football","Edi Rama");
		CountryDTO dto189 = new CountryDTO(189, "Uruguay","Montevideo",3423108,true,LocalDate.of(1825,8,25),6, "Christianity", "Pitangus sulphuratus","GoldenEagle","basketball","José Alberto");
		CountryDTO dto190 = new CountryDTO(190, "Uzbekistan","Tashkent",35163944,true,LocalDate.of(1991,7,12),12, "Islam", "sand cat","Eagle","football","Abdulla Aripov");
		CountryDTO dto191 = new CountryDTO(191, "Vanuatu","Portvila",334506,false,LocalDate.of(1980,7,30),6, "Christianity", "Iguna","Lapwing","Soccer","Charlot Salwai");
		CountryDTO dto192 = new CountryDTO(192, "Vaticancity","Vatican",795199,true,LocalDate.of(1929,2,11),5, "Christianity", "BrownBear","BaldEagle","Soccer","The Pope");
		CountryDTO dto193 = new CountryDTO(193, "Venezuela","Caracas",28838499,false,LocalDate.of(1811,7,5),23, "Christianity", "Bear","Venezuelan","Baseball","Madruo");
		CountryDTO dto194 = new CountryDTO(194, "Vietnam","Hanoi",98858950,true,LocalDate.of(1945,9,2),6, "Buddhism", "WaterBafflo"," Venezuelan Troupial","Soccer","Pham Minh Chính");
		CountryDTO dto195 = new CountryDTO(195, "Yemen","Sanna",34449825,false,LocalDate.of(1967,11,30),21, "Islam", "Arabian leopard"," Vietnamese Pheasant","Soccer","Maeen Abdulmalik Saeed");
		Collection<CountryDTO> collection=new ArrayList();
		    collection.add(dto1);
			collection.add(dto2);
			collection.add(dto3);
			collection.add(dto4);
			collection.add(dto5);
			collection.add(dto6);
			collection.add(dto7);
			collection.add(dto8);
			collection.add(dto9);
			collection.add(dto10);
			collection.add(dto11);
			collection.add(dto12);
			collection.add(dto13);
			collection.add(dto14);
			collection.add(dto15);
			collection.add(dto16);
			collection.add(dto17);
			collection.add(dto18);
			collection.add(dto19);
			collection.add(dto20);
			collection.add(dto21);
			collection.add(dto22);
			collection.add(dto23);
			collection.add(dto24);
			collection.add(dto25);
			collection.add(dto26);
			collection.add(dto27);
			collection.add(dto28);
			collection.add(dto29);
			collection.add(dto30);
			collection.add(dto31);
			collection.add(dto32);
			collection.add(dto33);
			collection.add(dto34);
			collection.add(dto35);
			collection.add(dto36);
			collection.add(dto37);
			collection.add(dto38);
			collection.add(dto39);
			collection.add(dto40);
			collection.add(dto41);
			collection.add(dto42);
			collection.add(dto43);
			collection.add(dto44);
			collection.add(dto45);
			collection.add(dto46);
			collection.add(dto47);
			collection.add(dto48);
			collection.add(dto49);
			collection.add(dto50);
			collection.add(dto51);
			collection.add(dto52);
			collection.add(dto53);
			collection.add(dto54);
			collection.add(dto55);
			collection.add(dto56);
			collection.add(dto57);
			collection.add(dto58);
			collection.add(dto59);
			collection.add(dto60);
			collection.add(dto61);
			collection.add(dto62);
			collection.add(dto63);
			collection.add(dto64);
			collection.add(dto65);
			collection.add(dto66);
			collection.add(dto67);
			collection.add(dto68);
			collection.add(dto69);
			collection.add(dto70);
			collection.add(dto71);
			collection.add(dto72);
			collection.add(dto73);
			collection.add(dto74);
			collection.add(dto75);
			collection.add(dto76);
			collection.add(dto77);
			collection.add(dto78);
			collection.add(dto79);
			collection.add(dto80);
			collection.add(dto81);
			collection.add(dto82);
			collection.add(dto83);
			collection.add(dto84);
			collection.add(dto85);
			collection.add(dto86);
			collection.add(dto87);
			collection.add(dto88);
			collection.add(dto89);
			collection.add(dto90);
			collection.add(dto91);
			collection.add(dto92);
			collection.add(dto93);
			collection.add(dto94);
			collection.add(dto95);
			collection.add(dto96);
			collection.add(dto97);
			collection.add(dto98);
			collection.add(dto99);
			collection.add(dto100);
			collection.add(dto101);
			collection.add(dto102);
			collection.add(dto103);
			collection.add(dto104);
			collection.add(dto105);
			collection.add(dto106);
			collection.add(dto107);
			collection.add(dto108);
			collection.add(dto109);
			collection.add(dto110);
			collection.add(dto111);
			collection.add(dto112);
			collection.add(dto113);
			collection.add(dto114);
			collection.add(dto115);
			collection.add(dto116);
			collection.add(dto117);
			collection.add(dto118);
			collection.add(dto119);
			collection.add(dto120);
			collection.add(dto121);
			collection.add(dto122);
			collection.add(dto123);
			collection.add(dto124);
			collection.add(dto125);
			collection.add(dto126);
			collection.add(dto127);
			collection.add(dto128);
			collection.add(dto129);
			collection.add(dto130);
			collection.add(dto131);
			collection.add(dto132);
			collection.add(dto133);
			collection.add(dto134);
			collection.add(dto135);
			collection.add(dto136);
			collection.add(dto137);
			collection.add(dto138);
			collection.add(dto139);
			collection.add(dto140);
			collection.add(dto141);
			collection.add(dto142);
			collection.add(dto143);
			collection.add(dto144);
			collection.add(dto145);
			collection.add(dto146);
			collection.add(dto147);
			collection.add(dto148);
			collection.add(dto149);
			collection.add(dto150);
			collection.add(dto151);
			collection.add(dto152);
			collection.add(dto153);
			collection.add(dto154);
			collection.add(dto155);
			collection.add(dto156);
			collection.add(dto157);
			collection.add(dto158);
			collection.add(dto159);
			collection.add(dto160);
			collection.add(dto161);
			collection.add(dto162);
			collection.add(dto163);
			collection.add(dto164);
			collection.add(dto165);
			collection.add(dto166);
			collection.add(dto167);
			collection.add(dto168);
			collection.add(dto169);
			collection.add(dto170);
			collection.add(dto171);
			collection.add(dto172);
			collection.add(dto173);
			collection.add(dto174);
			collection.add(dto175);
			collection.add(dto176);
			collection.add(dto177);
			collection.add(dto178);
			collection.add(dto179);
			collection.add(dto180);
			collection.add(dto181);
			collection.add(dto182);
			collection.add(dto183);
			collection.add(dto184);
			collection.add(dto185);
			collection.add(dto186);
			collection.add(dto187);
			collection.add(dto188);
			collection.add(dto189);
			collection.add(dto190);
			collection.add(dto191);
			collection.add(dto192);
			collection.add(dto193);
			collection.add(dto194);
			collection.add(dto195);
			System.out.println("Total Countries : "+collection.size());
			Iterator<CountryDTO> itr=collection.iterator();
			while(itr.hasNext()) {
				CountryDTO countryDto=itr.next();
				System.out.println("Country names:"+countryDto.getName());
			}
			CountryDTO dto196 =  new CountryDTO(196,"Kailasa", "Kailasa1", 8765467,false,LocalDate.of(2018, 06, 05),28,"Hinduism", "Nithya","peacock","Kabbadi", "Nithyananda");
               boolean cont=collection.contains(dto196);
               System.out.println(cont);
               
               
               collection.add(dto196);
               boolean cont1=collection.contains(dto196);
               System.out.println(cont1);
               
               
   			CountryDTO dto197 =  new CountryDTO(196,"Kailasa", "Kailasa1", 8765467,false,LocalDate.of(2018, 06, 05),28,"Hinduism", "Nithya","peacock","Kabbadi", "Nithyananda");

            boolean cont2=collection.contains(dto197);
            System.out.println(cont2);

            
            Iterator<CountryDTO> itr2=collection.iterator();
            
            while(itr2.hasNext()) {
            
			CountryDTO countryDto1=itr2.next();
			if(countryDto1.getName().startsWith("I"))
			
		
			System.out.println("Country names:"+countryDto1.getName());

			
            }
            
            
            
 Iterator<CountryDTO> itr3=collection.iterator();
            
            while(itr3.hasNext()) {
            
			CountryDTO countryDto2=itr3.next();
			if(countryDto2.getName().contains("ma"))
			
			

			System.out.println("Country names with ma :"+countryDto2.getName());

			
            }
            
            
            for(CountryDTO countryDto: collection) {
            	
            	if(countryDto.getName().endsWith("a")) {
            		System.out.println(countryDto.getName());
            	}
            	
            }

            



	}

}