
package com.adept.ims.course.web;

import com.adept.ims.course.service.SubjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Annotation-driven <em>MultiActionController</em> that handles all non-form
 * URL's.
 *
 */
@Controller
public class CourseController {

	private final SubjectService subjectService;


	@Autowired
	public CourseController(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

	/**
	 * Custom handler for the welcome view.
	 * <p>
	 * Note that this handler relies on the RequestToViewNameTranslator to
	 * determine the logical view name based on the request URL: "/welcome.do"
	 * -&gt; "welcome".
	 */
	@RequestMapping("/course/welcome.do")
	public void welcomeHandler() {
	}

}
