package Clases;
import javax.swing.DefaultComboBoxModel;

public class UbicacionUbigeo {
	
	// Retorna el modelo de provincias según el departamento
    public static DefaultComboBoxModel<String> getProvincias(String departamento) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        
        if(departamento.equalsIgnoreCase("LIMA")) {
            model.addElement("LIMA");
            model.addElement("BARRANCA");
            model.addElement("CAJATAMBO");
            model.addElement("CANTA");
            model.addElement("CAÑETE");
            model.addElement("HUARAL");
            model.addElement("HUAROCHIRI");
            model.addElement("HUAURA");
            model.addElement("OYON");
            model.addElement("YAUYOS"); 
        }
        else if(departamento.equalsIgnoreCase("ICA")) {
            model.addElement("ICA");
            model.addElement("CHINCHA");
            model.addElement("NASCA");
            model.addElement("PALPA");
            model.addElement("PISCO");
        }
        
        return model;
    }
    
    // Retorna el modelo de distritos según la provincia
    public static DefaultComboBoxModel<String> getDistritos(String provincia) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        
        // --- PROVINCIA DE LIMA (43 distritos) ---
        if(provincia.equalsIgnoreCase("LIMA")) {
            String[] distritos = {
                "ANCON","ATE","BARRANCO","BREÑA","CARABAYLLO","CHACLACAYO","CHORRILLOS",
                "CIENEGUILLA","COMAS","EL AGUSTINO","INDEPENDENCIA","JESUS MARIA",
                "LA MOLINA","LA VICTORIA","LIMA","LINCE","LOS OLIVOS","LURIGANCHO",
                "LURIN","MAGDALENA DEL MAR","MIRAFLORES","PACHACAMAC","PUCUSANA",
                "PUEBLO LIBRE","PUENTE PIEDRA","PUNTA HERMOSA","PUNTA NEGRA","RIMAC",
                "SAN BARTOLO","SAN BORJA","SAN ISIDRO","SAN JUAN DE LURIGANCHO",
                "SAN JUAN DE MIRAFLORES","SAN LUIS","SAN MARTIN DE PORRES","SAN MIGUEL",
                "SANTA ANITA","SANTA MARIA DEL MAR","SANTA ROSA","SANTIAGO DE SURCO",
                "SURQUILLO","VILLA EL SALVADOR","VILLA MARIA DEL TRIUNFO"
            };
            for(String d : distritos) model.addElement(d);
        }
        
        // --- BARRANCA (5 distritos) ---
        else if(provincia.equalsIgnoreCase("BARRANCA")) {
            String[] distritos = {"BARRANCA","PARAMONGA","PATIVILCA","SUPE","SUPE PUERTO"};
            for(String d : distritos) model.addElement(d);
        }
        
        // --- CAJATAMBO (5 distritos) ---
        else if(provincia.equalsIgnoreCase("CAJATAMBO")) {
            String[] distritos = {"CAJATAMBO","COPA","GORGOR","HUANCAPON","MANAS"};
            for(String d : distritos) model.addElement(d);
        }
        
        // --- CANTA (7 distritos) ---
        else if(provincia.equalsIgnoreCase("CANTA")) {
            String[] distritos = {"CANTA","ARAHUAY","HUAMANTANGA","HUAROS","LACHAQUI","SAN BUENAVENTURA","SANTA ROSA DE QUIVES"};
            for(String d : distritos) model.addElement(d);
        }
        
        // --- CAÑETE (16 distritos) ---
        else if(provincia.equalsIgnoreCase("CAÑETE")) {
            String[] distritos = {
                "SAN VICENTE DE CAÑETE","ASIA","CALANGO","CERRO AZUL","CHILCA","COAYLLO",
                "IMPERIAL","LUNAHUANA","MALA","NUEVO IMPERIAL","PACARAN","QUILMANA",
                "SAN ANTONIO","SAN LUIS","SANTA CRUZ DE FLORES","ZUÑIGA"
            };
            for(String d : distritos) model.addElement(d);
        }
        
        // --- HUARAL (12 distritos) ---
        else if(provincia.equalsIgnoreCase("HUARAL")) {
            String[] distritos = {
                "HUARAL","ATAVILLOS ALTO","ATAVILLOS BAJO","AUCALLAMA","CHANCAY",
                "IHUARI","LAMPIAN","PACARAOS","SAN MIGUEL DE ACOS",
                "SANTA CRUZ DE ANDAMARCA","SUMBILCA","VEINTISIETE DE NOVIEMBRE"
            };
            for(String d : distritos) model.addElement(d);
        }
        
        // --- HUAROCHIRI (32 distritos) ---
        else if(provincia.equalsIgnoreCase("HUAROCHIRI")) {
            String[] distritos = {
                "MATUCANA","ANTIOQUIA","CALLAHUANCA","CARAMPOMA","CHICLA","CUENCA",
                "HUACHUPAMPA","HUANZA","HUAROCHIRI","LAHUAYTAMBO","LANGA","LARAOS",
                "MARIATANA","RICARDO PALMA","SAN ANDRES DE TUPICOCHA","SAN ANTONIO",
                "SAN BARTOLOME","SAN DAMIAN","SAN JUAN DE IRIS","SAN JUAN DE TANTARANCHE",
                "SAN LORENZO DE QUINTI","SAN MATEO","SAN MATEO DE OTAO","SAN PEDRO DE CASTA",
                "SAN PEDRO DE HUANCAYRE","SANGALLAYA","SANTA CRUZ DE COCACHACRA","SANTA EULALIA",
                "SANTIAGO DE ANCHUCAYA","SANTIAGO DE TUNA","SANTO DOMINGO DE LOS OLLEROS","SURCO"
            };
            for(String d : distritos) model.addElement(d);
        }
        
        // --- HUAURA (12 distritos) ---
        else if(provincia.equalsIgnoreCase("HUAURA")) {
            String[] distritos = {
                "HUACHO","AMBAR","CALETA DE CARQUIN","CHECRAS","HUALMAY","HUAURA","LEONCIO PRADO",
                "PACCHO","SANTA LEONOR","SANTA MARIA","SAYAN","VEGUETA"
            };
            for(String d : distritos) model.addElement(d);
        }
        
        // --- OYON (6 distritos) ---
        else if(provincia.equalsIgnoreCase("OYON")) {
            String[] distritos = {"OYON","ANDAJES","CAUJUL","COCHAMARCA","NAVAN","PACHANGARA"};
            for(String d : distritos) model.addElement(d);
        }
        
        // --- YAUYOS (33 distritos) ---
        else if(provincia.equalsIgnoreCase("YAUYOS")) {
            String[] distritos = {
                "YAUYOS","ALIS","AYAUCA","AYAVIRI","AZANGARO","CACRA","CARANIA","CATAHUASI",
                "CHOCOS","COCHAS","COLONIA","HONGOS","HUAMPARA","HUANCAYA","HUANGASCAR",
                "HUANTAN","HUAÑEC","LARAOS","LINCHA","MADEAN","MIRAFLORES","OMAS",
                "PUTINZA","QUINCHES","QUINOCAY","SAN JOAQUIN","SAN PEDRO DE PILAS",
                "TANTA","TAURIPAMPA","TOMAS","TUPE","VIÑAC","VITIS"
            };
            for(String d : distritos) model.addElement(d);
        }
        
        
     // =======================
        // PROVINCIAS DE ICA
        // =======================
        else if(provincia.equalsIgnoreCase("ICA")) {
            String[] distritos = {"ICA","LA TINGUIÑA","LOS AQUIJES","OCUCAJE","PACHACUTEC","PARCONA","PUEBLO NUEVO","SALAS","SAN JOSE DE LOS MOLINOS","SAN JUAN BAUTISTA","SANTIAGO","SUBTANJALLA","TATE","YAUCA DEL ROSARIO"};
            for(String d : distritos) model.addElement(d);
        }
        else if(provincia.equalsIgnoreCase("CHINCHA")) {
            String[] distritos = {"CHINCHA ALTA","ALTO LARAN","CHAVIN","CHINCHA BAJA","EL CARMEN","GROCIO PRADO","PUEBLO NUEVO","SAN JUAN DE YANAC","SAN PEDRO DE HUACARPANA","SUNAMPE","TAMBO DE MORA"};
            for(String d : distritos) model.addElement(d);
        }
        else if(provincia.equalsIgnoreCase("NASCA")) {
            String[] distritos = {"NASCA","CHANGUILLO","EL INGENIO","MARCONA","VISTA ALEGRE"};
            for(String d : distritos) model.addElement(d);
        }
        else if(provincia.equalsIgnoreCase("PALPA")) {
            String[] distritos = {"PALPA","LLIPATA","RIO GRANDE","SANTA CRUZ","TIBILLO"};
            for(String d : distritos) model.addElement(d);
        }
        else if(provincia.equalsIgnoreCase("PISCO")) {
            String[] distritos = {"PISCO","HUANCANO","HUMAY","INDEPENDENCIA","PARACAS","SAN ANDRES","SAN CLEMENTE","TUPAC AMARU INCA"};
            for(String d : distritos) model.addElement(d);
        }
        
        return model;
    }
}
