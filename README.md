
<h1>Coding Test</h1>

<p><span>1️⃣ Strategy Pattern</span></p>
<p><span>요구사항</span></p>
<ul>
    <li>
        <span>GameCharacter의 공격기능</span>
    </li>
    <li>
        <span>기본적으로 맨손공격이 가능함. 무기를 장착 할 수 있으며,검, 활, 도끼등의 무기를 장착 할 수 있다.</span>
    </li>
    <li>
        <span>console에 공격상태를 출력</span>
    </li>
</ul>

<p><span>2️⃣ Factory Method Pattern</span></p>
<p><span>요구사항</span></p>
<ul>
<li style="list-style-type: decimal">아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청합니다.</li>
<li style="list-style-type: decimal">아이템을 생성 후 아이템 복제등의 어뷰징을 방지하기 위해 데이터 베이스에 아이템 생성정보를 남깁니다.</li>
</ul>
<ul>
<li style="list-style-type: square">아이템을 생성하는 주체를 ItemCreator로 이름 짓습니다.</li>
</ul>
<ul>
<li style="list-style-type: square">아이템은 item이라는 interface로 다룰 수 있도록 합니다.</li>
<ul>
<li style="list-style-type: decimal">item은 use함수를 기본 함수로 갖고 있습니다.</li>
</ul>
</ul>