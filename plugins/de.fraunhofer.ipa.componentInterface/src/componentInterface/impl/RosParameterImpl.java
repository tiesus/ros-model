/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.RosParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ros.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RosParameterImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link componentInterface.impl.RosParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.impl.RosParameterImpl#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosParameterImpl extends MinimalEObjectImpl.Container implements RosParameter {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected String ns = NS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.ROS_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.ROS_PARAMETER__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PARAMETER__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNs() {
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNs(String newNs) {
		String oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PARAMETER__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_PARAMETER__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case ComponentInterfacePackage.ROS_PARAMETER__NAME:
				return getName();
			case ComponentInterfacePackage.ROS_PARAMETER__NS:
				return getNs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_PARAMETER__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case ComponentInterfacePackage.ROS_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case ComponentInterfacePackage.ROS_PARAMETER__NS:
				setNs((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_PARAMETER__PARAMETER:
				setParameter((Parameter)null);
				return;
			case ComponentInterfacePackage.ROS_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.ROS_PARAMETER__NS:
				setNs(NS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_PARAMETER__PARAMETER:
				return parameter != null;
			case ComponentInterfacePackage.ROS_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentInterfacePackage.ROS_PARAMETER__NS:
				return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ns: ");
		result.append(ns);
		result.append(')');
		return result.toString();
	}

} //RosParameterImpl
