$(function() {
	// Solving the active menu problem
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'View Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('selected');
		$('#a_'+menu).addClass('active');
		break;

	}

});
