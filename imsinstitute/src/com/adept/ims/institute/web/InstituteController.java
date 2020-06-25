
package com.adept.ims.institute.web;

import com.adept.ims.institute.service.TrustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Annotation-driven <em>MultiActionController</em> that handles all non-form
 * URL's.
 *
 */
@Controller
public class InstituteController {

	private final TrustService trustService;


	@Autowired
	public InstituteController(TrustService trustService) {
		this.trustService = trustService;
	}

	/**
	 * Custom handler for the welcome view.
	 * <p>
	 * Note that this handler relies on the RequestToViewNameTranslator to
	 * determine the logical view name based on the request URL: "/welcome.do"
	 * -&gt; "welcome".
	 */
	@RequestMapping("/institute/welcome.do")
	public void welcomeHandler() {
	}

}
