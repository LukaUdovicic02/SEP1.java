package model;

import java.util.ArrayList;

public class RequirementsList
{
  private ArrayList<Requirement> requirements;

  public RequirementsList()
  {
    requirements = new ArrayList<>();
  }

  public void add(Requirement requirement)
  {
    requirements.add(requirement);
  }

  public ArrayList<Requirement> getRequirements()
  {
    return requirements;
  }
  public int getSize()
  {
    return requirements.size();
  }
  public Requirement SpeicficReq(int index)
  {
    return requirements.get(index);
  }

  public Requirement removeRequirement(Requirement requirement)
  {
    for (int i = 0; i < requirements.size(); i++)
    {
      if (SpeicficReq(i).getTitle().equals(requirement.getTitle()))
      {
        requirements.remove(i);
        break;
      }
    }
    return null;
  }
}
