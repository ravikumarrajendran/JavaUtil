import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class CopyBeanClient {

	/**
	 * To demonstrate the copy bean properties.
	 * @param args
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	public static void main(String[] args) throws IllegalAccessException,
			InvocationTargetException {

		EmployeeEntity empEntity = new EmployeeEntity();

		EmployeeVO empVO = new EmployeeVO("ravi", 112233, "Associate");
		/*
		 * Copy property values from the origin bean to the destination bean for
		 * all cases where the property names are the same. Example:
		 * BeanUtilsBean.copyProperties(dest,orig).
		 * Parameters: dest - Destination bean whose properties are modified
		 * orig - Origin bean whose properties are retrieved
		 */
		BeanUtils.copyProperties(empEntity, empVO);
		/*
		 * ToStringBuilder class aims to simplify the process by.
		 * 1.Allowing field names 2.Handling all types consistently 3.Handling
		 * nulls consistently 4.Enabling the detail level to be controlled for
		 * Objects and Collections
		 */
		System.out.println(ToStringBuilder.reflectionToString(empEntity,
				ToStringStyle.MULTI_LINE_STYLE));

	}

}
