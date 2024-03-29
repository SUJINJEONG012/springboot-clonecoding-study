<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ include file="../layout/header.jsp"%>



<c:forEach var="image" items="${images}">
				<!--피드 박스-->
				<div class="story-list__item">

					<!--리스트 아이템 헤더영역-->
					<div class="sl__item__header">
						<div>
							<img src="/images/profile.jpeg" alt="">
							<svg viewbox="0 0 110 110">
                                <circle cx="55" cy="55" r="53" />
                            </svg>
						</div>
						<div>${image.user.username}</div>
					</div>
					<!--헤더영역 end-->

					<!--게시물이미지 영역-->
					<div class="sl__item__img">
						<img src="/images/home3.jpg" alt="">
					</div>

					<!--게시물 내용 + 댓글 영역-->
					<div class="sl__item__contents">
						<!-- 하트모양 버튼 박스 -->
						<div class="sl__item__contents__icon">
							<button onclick="clickBtn()">
								<i class="far fa-heart"></i>
							</button>
						</div>
						<!-- 하트모양 버튼 박스 end -->

						<!--좋아요-->
						<span class="like"><b>1</b>likes</span>
						<!--좋아요end-->

						<!--태그박스-->
						<div class="sl__item__contents__tags">
							<p>#운동 #공부 #음식</p>
						</div>
						<!--태그박스end-->

						<!--게시글내용-->
						<div class="sl__item__contents__content">
							<p>${image.caption}</p>
						
						</div>
						<!--게시글내용end-->

						<!--댓글박스-->
						<div>
							<div class="sl__item__contents__comment">
								<p>
									<b>아이디 : </b>용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용
								</p>
								<button>
									<i class="fas fa-times"></i>
								</button>
							</div>
						</div>
						<!--댓글박스end-->

						<!--댓글입력박스-->
						<div class="sl__item__input">
							<input type="text" placeholder="댓글 달기...">
							<button>게시</button>
						</div>
						<!--댓글달기박스end-->
					</div>
				</div>
			</c:forEach>


  <%@ include file="../layout/footer.jsp"%>