public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int count = 0;
    for (String[] row: nameArray)
    {
      for (String name: row)
      {
        if (name.substring(0, name.indexOf(',')).equals(lastName))
          count++;
      }
    }
    return count;
  }
}