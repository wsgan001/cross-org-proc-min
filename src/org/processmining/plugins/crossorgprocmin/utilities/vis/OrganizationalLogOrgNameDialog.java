package org.processmining.plugins.crossorgprocmin.utilities.vis;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

import org.processmining.framework.util.ui.widgets.ProMHeaderPanel;
import org.processmining.framework.util.ui.widgets.ProMTextField;

public class OrganizationalLogOrgNameDialog extends JPanel {

	private List<String> organizationNames = new ArrayList<String>(100);
	Map<Integer, ProMTextField> fields = new HashMap<Integer, ProMTextField>();
	private int size;

	/**
	 * Create the panel.
	 */
	public OrganizationalLogOrgNameDialog(final int size) {

		this.size = size;
		setLayout(new GridLayout(1, 0, 0, 0));

		ProMHeaderPanel panel = new ProMHeaderPanel("Please provide a name for each organization:");
		add(panel);

		for (int i = 1; i <= size; i++) {
			ProMTextField field = new ProMTextField("Organization Name for Log " + i);
			// System.out.println(field.getText());
			fields.put(i, field);
			panel.add(field);
		}

	}

	public List<String> getOrganizationNames() {
		organizationNames.add("Select");
		for (int i = 1; i <= size; i++) {
			organizationNames.add(fields.get(i).getText());
		}
		return organizationNames;
	}

	public void setOrganizationNames(List<String> organizationNames) {
		this.organizationNames = organizationNames;
	}

}
