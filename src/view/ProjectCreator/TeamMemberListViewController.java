package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.scene.layout.Region;
import view.ViewHandler;

public class TeamMemberListViewController {
  private Region root;
  private ViewHandler view;

  public void init(Region root, ViewHandler view){
    this.root = root;
    this.view = view;
  }
  public Region getRoot(){
    return root;
  }


  public void backOnClick(ActionEvent actionEvent) {
    view.openView("ProjectListCreate");
  }

  public void addOnClick(ActionEvent actionEvent) {
    view.openView("AddMember");
  }

  public void removeOnClick(ActionEvent actionEvent) {
  }

  public void changeOnClick(ActionEvent actionEvent) {
    view.openView("Role");
  }
}
