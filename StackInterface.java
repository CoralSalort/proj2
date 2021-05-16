public interface StackInterface {

    public void Stack(); // Creat Stack vacio

    public void Push(); // Inserta carta al tope del stack

    public void Pop(); // Quita carta del tope del stack

    public int Size(); // Devuelve el tamano del stack

    public Card Peek(); // Muestra contenido de  la carta en el tope

    public boolean Empty(); // Devuelve true si esta vacio, false si no
}