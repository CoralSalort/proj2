public class Set extends Stack{

    static Stack set;
    private char rank; 
    private Card card;

    public Set(char r){
        super(52);
        rank = r;

    }
    
	  // Set acepta carta solo del mismo rank
    public void addCard( Card card ) {
        if(this.rank == card.getRank()){
            Push(card);
        }
        else{
            System.out.println("cards are not of the same rank");
        }
        
    }

    // Devuelve el index
	  public int getRankIndex(){
      return this.card.getRankIndex(getRank());
    }
	
    // Devuelve rank del set
    public char getRank(){
      return this.card.getRank();
    }

    // Determina si el set esta lleno
    public boolean isFull(){
      if(set.Size() == 3){ // No se si es 3 o 4
          return true;
      }
      else{
          return false;
      }
    }
	
}

