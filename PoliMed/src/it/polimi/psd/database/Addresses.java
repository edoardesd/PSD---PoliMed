package it.polimi.psd.database;

/**
 * @author edoardesd
 * Fake API Google
 */
public enum Addresses {
    MILANO ("Milano", "Via Rovello", 1, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2798.117980001468!2d9.182149114981959!3d45.46742724125007!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4786c152aebffa85%3A0x9d7dfe5a2dd855d6!2sVia+Rovello%2C+20121+Milano!5e0!3m2!1sit!2sit!4v1462306246800" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    CENISIO   ("Milano", "Via Cenisio", 23, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2797.124045868185!2d9.165973914982722!3d45.48744673991396!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4786c13d45c44813%3A0x35b5f5da4015bc25!2sVia+Cenisio%2C+23%2C+20154+Milano!5e0!3m2!1sit!2sit!4v1462306531323"+" width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    BERGAMO   ("Ponte San Pietro", "Via Garibaldi", 2, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2786.705494214492!2d9.587123714990865!3d45.69688192590905!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x478153a9fcdebddb%3A0x27fa4c1e59888838!2sVia+Giuseppe+Garibaldi%2C+2%2C+24036+Ponte+San+Pietro+BG!5e0!3m2!1sit!2sit!4v1462363753648" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0"+" allowfullscreen></iframe>"),
    SARONNO    ("Saronno", "Via Ramazzotti", 24, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2790.038631975717!2d9.03039871498828!3d45.62996023038949!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4786915c80a8400d%3A0xe09decde25a56d76!2sVia+Angelo+Ramazzotti%2C+24%2C+21047+Saronno+VA!5e0!3m2!1sit!2sit!4v1462363819842" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    GALLARATE ("Gallarate", "Via Agnelli",   29, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2788.7972005615707!2d8.78223171498923!3d45.654894228720636!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x478689e38a5b536b%3A0xe942d413048618e1!2sVia+Arnaldo+Agnelli%2C+29%2C+21013+Gallarate+VA!5e0!3m2!1sit!2sit!4v1462363864850" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    LEGNANO  ("Legnano", "Via San Bernardino", 12, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2792.096640422029!2d8.90984131556167!3d45.58860197910263!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47868d0f274282f3%3A0xce220d2e739067f5!2sVia+S.+Bernardino%2C+12%2C+20025+Legnano+MI!5e0!3m2!1sit!2sit!4v1462363889732" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    COMO  ("Como", "Piazza Amendola", 1, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2780.8124832833155!2d9.082721314995446!3d45.81501371798806!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47869db6117e023b%3A0xa751fcfb8c2cdbba!2sComo+-+Piazza+Amendola!5e0!3m2!1sit!2sit!4v1462363916418" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"="+"border:0" +"allowfullscreen></iframe>"),
    PAVIA ("Vigevano", "Via Matteotti", 5, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2805.5849112494925!2d8.871779914976184!3d45.316809951288086!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4786e34684db9bd5%3A0x3a9284ca80e1bf9!2sVia+Giacomo+Matteotti%2C+1%2C+27029+Vigevano+PV!5e0!3m2!1sit!2sit!4v1462363948130" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    TORINO ("Torino", "Via Castellamonte", 10, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2817.486058182681!2d7.664645514966892!3d45.07593576728831!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47886d08a4b132c7%3A0x13413bfec1197fc8!2sVia+Castellamonte%2C+10%2C+10138+Torino!5e0!3m2!1sit!2sit!4v1462363980020" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    GARIBALDI ("Milano", "Corso Garibaldi", 49, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2797.7972644885085!2d9.180881614982242!3d45.47388774081902!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4786c14b979b2a27%3A0xb79fe2eb99a02d08!2sCorso+Garibaldi%2C+49%2C+20121+Milano!5e0!3m2!1sit!2sit!4v1462364016745" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    GESSATE ("Gessate", "Via Cant&ugrave;", 4, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2793.7403414081123!2d9.432239314985365!3d45.55554873536541!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4786b44d952f36d5%3A0xaa422439d49965f5!2sVia+Cant%C3%B9%2C+4%2C+20060+Gessate+MI!5e0!3m2!1sit!2sit!4v1462364043899" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    PALERMO ("Palermo", "Via Messina", 4, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3138.5743108145075!2d13.351537514719517!3d38.126836799599666!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x1319ef5991db54c7%3A0x49af1debe0220642!2sVia+Messina%2C+4%2C+90141+Palermo!5e0!3m2!1sit!2sit!4v1462364068690" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    SENAGO ("Senago", "Via della Liberazione", 6, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2792.4622900371614!2d9.125555314986384!3d45.58125073364738!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47869580af50db75%3A0xcaa357b2056def8b!2sVia+della+Liberazione%2C+6%2C+20030+Senago+MI!5e0!3m2!1sit!2sit!4v1462364092225" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    DUOMO ("Milano", "Piazza Duomo", 1, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2798.2791012365133!2d9.187799814981865!3d45.464181341466684!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4786c6ae939351df%3A0xd445dec2978d0e3f!2sPiazza+del+Duomo%2C+Milano!5e0!3m2!1sit!2sit!4v1462364114168" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    PIOLA ("Milano", "Piazzale Leonardo", 32, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2797.590663261749!2d9.224084614982354!3d45.47804914054113!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2sPiazza+Leonardo+Da+Vinci%2C+32%2C+I-20133+Milano%2C+Italia!5e0!3m2!1sit!2sit!4v1462364124921" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>"),
    POLONORD ("Lapponia", "Via Fredda", 66, "<iframe src="+"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d63367.853587153106!2d26.73458139528585!3d69.45428808199848!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNjnCsDI3JzU0LjYiTiAyNsKwNDcnNTIuMyJF!5e0!3m2!1sit!2sit!4v1462364662660" +"width="+"600" +"height="+"450" +"frameborder="+"0" +"style="+"border:0" +"allowfullscreen></iframe>");

    private final String city;
    private final String street;  
    private final int civicNumber;
    private final String map;

	Addresses(String city, String street, int civicNumber, String map) {
        this.city = city;
        this.street = street;
        this.civicNumber = civicNumber;
        this.map = map;
    }
    
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public int getCivicNumber() {
		return civicNumber;
	}
	public String getMap() {
		return map;
	}
	public static Addresses getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
	
}