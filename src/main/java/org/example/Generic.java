package org.example;

public class Generic<T> {
    private  T content;

    public T getContent()
    {
        return content;
    }
public void setContent(T content)
{
    this.content = content;
}
    public void yazGeneric() {
        System.out.println("Generic : " + content);
    }
    public void ayrac()  {
        System.out.println("**********************************");
    }
}
