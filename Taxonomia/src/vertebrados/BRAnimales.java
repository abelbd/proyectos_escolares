/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
   package vertebrados;

   import Rule.*;

   public class BRAnimales
   {
   //    declaracion del tipo de reglas
      BooleanRuleBase br = new BooleanRuleBase("test");
   //    declaracion de variable de reglas
    
      RuleVariable Sangrecaliente;
      RuleVariable Plumas;
      RuleVariable Metamorfosis;
      RuleVariable Respiracionbranquial;
      RuleVariable Patas;
      RuleVariable Cola;
      RuleVariable CuerpoAlargado;
      RuleVariable Corre;
      RuleVariable Vuela;
      RuleVariable Placenta;
      RuleVariable BolsaAbdominal;
      RuleVariable Oviparo;
      RuleVariable MudaPiel;
      RuleVariable Caparazon;
      RuleVariable ColaNadar;
      RuleVariable CabezaPico;
      RuleVariable EsqueletoCartilago;
      RuleVariable EsqueletoOseo;
      RuleVariable PatasR;
      RuleVariable DientesVisibles;
  
      RuleVariable Vertebrado1;
      RuleVariable Vertebrado2;
      RuleVariable Vertebrado3;
      
      String svertebrado1;
      String svertebrado2;
      String svertebrado3;

   
      public void BaseReglas()
      {
      
      }
   
      public String getVertebrado(String sangrecaliente,
            String plumas, String respiracionbranquial,
            String metamorfosis)
      {
      
         staterBR();
         Sangrecaliente.setValue(sangrecaliente);
         Plumas.setValue(plumas);
         Respiracionbranquial.setValue(respiracionbranquial);
         Metamorfosis.setValue(metamorfosis);
         
          
         br.forwardChain();
         svertebrado1 = Vertebrado1.getValue();
      
         return svertebrado1;
      }
      public String getVertebrado2(String vertebrado1,String patas,String cola, String cuerpoalargado,String corre, String vuela,String placenta
      ,String bolsaabdominal,String oviparo,String mudapiel,String caparazon, String colaparanadar,String cabezapico,
      String esquelcartilago, String esqueloseo){
          
          staterBR();
          Vertebrado1.setValue(vertebrado1);
          Patas.setValue(patas);
          Cola.setValue(cola);
          CuerpoAlargado.setValue(cuerpoalargado);
          Corre.setValue(corre);
          Vuela.setValue(vuela);
        
          Placenta.setValue(placenta);
          BolsaAbdominal.setValue(bolsaabdominal);
          Oviparo.setValue(oviparo);
         
          MudaPiel.setValue(mudapiel);
          Caparazon.setValue(caparazon);
          ColaNadar.setValue(colaparanadar);
          CabezaPico.setValue(cabezapico);
          EsqueletoCartilago.setValue(esquelcartilago);
          EsqueletoOseo.setValue(esqueloseo);
         
         br.forwardChain();
         
         svertebrado2 = Vertebrado2.getValue();
         return svertebrado2;  
         
      }
      public String getVertebrado3(String vertebrado2,String patasr,String dientesvisi){
         
          staterBR();
          Vertebrado2.setValue(vertebrado2);
          PatasR.setValue(patasr);
          DientesVisibles.setValue(dientesvisi);
          
          br.forwardChain();
          
          svertebrado3 = Vertebrado3.getValue();
          return svertebrado3;
      }
   
    
      public void staterBR()
      {
      //        instancias de variables de regla
         Sangrecaliente = new RuleVariable(br,"Sangrecaliente");
         Plumas = new RuleVariable(br,"Plumas");
         Metamorfosis = new RuleVariable(br,"Metamorfosis");
         Respiracionbranquial = new RuleVariable(br,"Respiracionbranquial");
         
         Patas= new RuleVariable(br,"Patas");
         Cola= new RuleVariable(br,"Cola");
         CuerpoAlargado= new RuleVariable(br,"CuerpoAlargado");
         Corre= new RuleVariable(br,"Corre");
         Vuela= new RuleVariable(br,"Vuela");
        
         Placenta= new RuleVariable(br,"Placenta");
         BolsaAbdominal= new RuleVariable(br,"BolsaAbdominal");
         Oviparo= new RuleVariable(br,"Oviparo");
         
         MudaPiel= new RuleVariable(br,"MudaPiel");
         Caparazon= new RuleVariable(br,"Caparazon");
         ColaNadar= new RuleVariable(br,"ColaNadar");
         CabezaPico= new RuleVariable(br,"CabezaPico");
         EsqueletoCartilago= new RuleVariable(br,"EsqueletoCartilago");
         EsqueletoOseo= new RuleVariable(br,"EsqueletoOseo");
         
         Vertebrado1= new RuleVariable(br,"Vertebrado1");
         Vertebrado2= new RuleVariable(br,"Vertebrado2");
         Vertebrado3= new RuleVariable(br,"Vertebrado3");
         
         PatasR= new RuleVariable(br,"PatasR");
         DientesVisibles= new RuleVariable(br,"DientesVisibles");
      
       //        definicion de operadores logicos (condicionales)
         Condition igual = new Condition("=");
       
      //        creacion de reglas de validacion (Base de Reglas)
        
      // VERTEBRADOS    
         Rule ave = new Rule(br,"AVE", 
                   new Clause[]{new Clause(Sangrecaliente,igual,"si"),
                   new Clause(Plumas,igual,"si"),
                   new Clause(Respiracionbranquial,igual,"no"),
                   new Clause(Metamorfosis,igual,"no")},
                   new Clause(Vertebrado1,igual,"AVE"));
         Rule mamifero = new Rule(br,"MAMIFERO",
                        new Clause[]{new Clause(Sangrecaliente,igual,"si"), new Clause(Plumas,igual,"no"),new Clause(Respiracionbranquial,igual,"no"),new Clause(Metamorfosis,igual,"no")},
                        new Clause(Vertebrado1,igual,"MAMIFERO"));
         Rule reptil = new Rule(br,"REPTIL",
                      new Clause[]{new Clause(Sangrecaliente,igual,"no"), new Clause(Plumas,igual,"no"),new Clause(Respiracionbranquial,igual,"no"),new Clause(Metamorfosis,igual,"no")},
                      new Clause(Vertebrado1,igual,"REPTIL"));
         Rule pez = new Rule(br,"PEZ",
                   new Clause[]{new Clause(Sangrecaliente,igual,"no"), new Clause(Plumas,igual,"no"),new Clause(Respiracionbranquial,igual,"si"),new Clause(Metamorfosis,igual,"no")},
                   new Clause(Vertebrado1,igual,"PEZ"));
         Rule anfibio = new Rule(br,"ANFIBIO",
                       new Clause[]{new Clause(Sangrecaliente,igual,"no"), new Clause(Plumas,igual,"no"),new Clause(Respiracionbranquial,igual,"no"),new Clause(Metamorfosis,igual,"si")},
                       new Clause(Vertebrado1,igual,"ANFIBIO"));
         //Vertebrado 2 Anfibio 
             Rule apodo = new Rule(br,"APODO",new Clause[]{new Clause(Vertebrado1,igual,"ANFIBIO"),new Clause(Patas,igual,"no"),new Clause(Cola,igual,"si"),new Clause(CuerpoAlargado,igual,"si")},
                     new Clause(Vertebrado2,igual,"APODO"));
             
             Rule urodelo = new Rule(br,"URODELO",new Clause[]{new Clause(Vertebrado1,igual,"ANFIBIO"),new Clause(Patas,igual,"si"),new Clause(Cola,igual,"si"),new Clause(CuerpoAlargado,igual,"si")},
                     new Clause(Vertebrado2,igual,"URODELO"));
             
             Rule anauro = new Rule(br,"ANAURO",new Clause[]{new Clause(Vertebrado1,igual,"ANFIBIO"),new Clause(Patas,igual,"si"),new Clause(Cola,igual,"no"),new Clause(CuerpoAlargado,igual,"no")},
                     new Clause(Vertebrado2,igual,"ANAURO"));
         
         //Vertebrado2 Ave
         
         Rule paleognathae = new Rule(br,"PALEOGNATHAE",new Clause[]{new Clause(Vertebrado1,igual,"AVE"),new Clause(Corre,igual,"si"),new Clause(Vuela,igual,"no")},
                      new Clause(Vertebrado2,igual,"PALEOGNATHAE"));
         
         Rule Neognathae = new Rule(br,"NEOGNATHAE",new Clause[]{new Clause(Vertebrado1,igual,"AVE"),new Clause(Corre,igual,"si"),new Clause(Vuela,igual,"si")},
                      new Clause(Vertebrado2,igual,"NEOGNATHAE"));
         // Vertebrado2 Mamifero
         Rule eutheria = new Rule(br,"EUTHERIA",new Clause[]{new Clause(Vertebrado1,igual,"MAMIFERO"),new Clause(Placenta,igual,"si"),
                         new Clause(BolsaAbdominal,igual,"no"), new Clause(Oviparo,igual,"no")},
                          new Clause (Vertebrado2,igual,"EUTHERIA"));
         
         Rule metatheria = new Rule(br,"METATHERIA",new Clause[]{new Clause(Vertebrado1,igual,"MAMIFERO"),new Clause(Placenta,igual,"no"),
                         new Clause(BolsaAbdominal,igual,"si"), new Clause(Oviparo,igual,"no")},
                          new Clause (Vertebrado2,igual,"METATHERIA"));
         
         Rule prototheria = new Rule(br,"PROTOTHERIA",new Clause[]{new Clause(Vertebrado1,igual,"MAMIFERO"),new Clause(Placenta,igual,"no"),
                         new Clause(BolsaAbdominal,igual,"no"), new Clause(Oviparo,igual,"si")},
                          new Clause (Vertebrado2,igual,"PROTOTHERIA"));
         //Vertebrado2 Reptil
         
         Rule squamata = new Rule(br,"SQUAMATA",new Clause[]{new Clause(Vertebrado1,igual,"REPTIL"),new Clause(MudaPiel,igual,"si"),
                         new Clause(Caparazon,igual,"no"), new Clause(ColaNadar,igual,"no"), new Clause(CabezaPico,igual,"no")},
                          new Clause (Vertebrado2,igual,"SQUAMATA"));
         
         Rule quelonia = new Rule(br,"QUELONIA",new Clause[]{new Clause(Vertebrado1,igual,"REPTIL"),new Clause(MudaPiel,igual,"no"),
                         new Clause(Caparazon,igual,"si"), new Clause(ColaNadar,igual,"no"), new Clause(CabezaPico,igual,"no")},
                          new Clause (Vertebrado2,igual,"QUELONIA"));
         
         Rule cocodrilia = new Rule(br,"COCODRILIA",new Clause[]{new Clause(Vertebrado1,igual,"REPTIL"),new Clause(MudaPiel,igual,"no"),
                         new Clause(Caparazon,igual,"no"), new Clause(ColaNadar,igual,"si"), new Clause(CabezaPico,igual,"no")},
                          new Clause (Vertebrado2,igual,"COCODRILIA"));
         Rule rinocefalo = new Rule(br,"RINOCEFALO",new Clause[]{new Clause(Vertebrado1,igual,"REPTIL"),new Clause(MudaPiel,igual,"no"),
                         new Clause(Caparazon,igual,"no"), new Clause(ColaNadar,igual,"no"), new Clause(CabezaPico,igual,"si")},
                          new Clause (Vertebrado2,igual,"RINOCEFALO"));
         //vertebrado2 Pez
         Rule condrictio = new Rule(br,"CONDRICTIO",new Clause[]{new Clause(Vertebrado1,igual,"PEZ"),new Clause(EsqueletoCartilago,igual,"si"),new Clause(EsqueletoOseo,igual,"no")},
                      new Clause(Vertebrado2,igual,"CONDRICTIO"));
         
         Rule osteictio = new Rule(br,"OSTEICTIO",new Clause[]{new Clause(Vertebrado1,igual,"PEZ"),new Clause(EsqueletoCartilago,igual,"no"),new Clause(EsqueletoOseo,igual,"si")},
                      new Clause(Vertebrado2,igual,"OSTEICTIO"));
         
        //Vertebrado3 Lagarto
        Rule lagarto = new Rule(br,"LAGARTO",new Clause[]{new Clause(Vertebrado2,igual,"SQUAMATA"),new Clause(PatasR,igual,"si")},
                      new Clause(Vertebrado3,igual,"LAGARTO"));
        
        Rule serpiente = new Rule(br,"SERPIENTE",new Clause[]{new Clause(Vertebrado2,igual,"SQUAMATA"),new Clause(PatasR,igual,"no")},
                      new Clause(Vertebrado3,igual,"SERPIENTE"));
        //Vertebrado3 Tortuga
        Rule tortuga = new Rule(br,"TORTUGA",new Clause[]{new Clause(Vertebrado2,igual,"QUELONIA")},
                      new Clause(Vertebrado3,igual,"TORTUGA"));
        //Vertebrado3 Cocodrilia
        Rule cocodrilo = new Rule(br,"COCODRILO",new Clause[]{new Clause(Vertebrado2,igual,"COCODRILIA"),new Clause(DientesVisibles,igual,"si")},
                      new Clause(Vertebrado3,igual,"COCODRILO"));
        
        Rule caiman = new Rule(br,"CAIMAN",new Clause[]{new Clause(Vertebrado2,igual,"COCODRILIA"),new Clause(DientesVisibles,igual,"no")},
                      new Clause(Vertebrado3,igual,"CAIMAN"));
        //Vertebrado3 Rinocefalo
        
        Rule tuatara = new Rule(br,"TUATARA",new Clause[]{new Clause(Vertebrado2,igual,"RINOCEFALO")},
                      new Clause(Vertebrado3,igual,"TUATARA"));
       
      }
   }
