/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.BranchCondition#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getBranchCondition()
 * @model
 * @generated
 */
public interface BranchCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference.
   * @see #setContents(WorkflowBlock)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getBranchCondition_Contents()
   * @model containment="true"
   * @generated
   */
  WorkflowBlock getContents();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.BranchCondition#getContents <em>Contents</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contents</em>' containment reference.
   * @see #getContents()
   * @generated
   */
  void setContents(WorkflowBlock value);

} // BranchCondition
