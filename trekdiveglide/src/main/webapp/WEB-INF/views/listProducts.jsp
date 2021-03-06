<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="row">

		<!-- To Display the Sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>


		</div>

		<!-- To Display the Actual Products  -->
		<div class="col-md-9">

			<!-- Adding Breadcrumb Component -->

			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">/All Products</li>

						</ol>
					</c:if>


					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home </a></li>
							<li class="active">/ Category</li>
							<li class="active">/ ${category.name}</li>

						</ol>
					</c:if>

				</div>

			</div>

		</div>

	</div>

</div>