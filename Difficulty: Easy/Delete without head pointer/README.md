<h2><a href="https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions">Delete without head pointer</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given a node <strong>del_node</strong> of a Singly Linked List where you have to <strong>delete</strong> a <strong>value </strong>of the given node from the linked list but you are not given the <strong>head</strong> of the list.</span></p>
<p><span style="font-size: 18px;">By deleting the node value, we do not mean removing it from memory. We mean:</span></p>
<ul>
<li><span style="font-size: 18px;">The value of the given node should not exist in the linked list.</span></li>
<li><span style="font-size: 18px;">The number of nodes in the linked list should decrease by one.</span></li>
<li><span style="font-size: 18px;">All the values before &amp; after the <strong>del_node </strong>node should be in the same order.</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Note: </strong></span></p>
<ol>
<li><span style="font-size: 18px;">Multiple nodes can have the same values as the del_node, but you must only remove the node whose pointer del_node is given to you.</span></li>
<li><span style="font-size: 18px;">It is guaranteed that there exists a node with a value equal to the del_node value<strong> </strong>and it will <strong>not be the last node</strong> of the linked list.</span></li>
</ol>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>Linked List = 1 -&gt; 2, del_node = 1
<strong>Output: </strong></span><span style="font-size: 18px;">2<strong>
Explanation: </strong>After deleting 1 from the linked list, we have remaining nodes as 2.<br></span><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700161/Web/Other/blobid0_1724435615.png" width="398" height="159"> </pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>Linked List = 10 -&gt; 20 -&gt; 4 -&gt; 30, del_node = 20
<strong>Output: </strong>10-&gt;4-&gt;30<strong>
Explanation: </strong>After deleting 20 from the linked list, we have remaining nodes as 10, 4, 30.<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700161/Web/Other/blobid1_1724435635.png" width="390" height="156"><br></span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity</strong>: O(1).<br><strong>Expected Auxilliary Space</strong>: O(1).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>2 &lt;= number of nodes &lt;= 10<sup>6&nbsp;</sup>&nbsp;<br>1 &lt;= node-&gt;data &lt;= 10<sup>6</sup><br></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Samsung</code>&nbsp;<code>Visa</code>&nbsp;<code>Goldman Sachs</code>&nbsp;<code>Kritikal Solutions</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Linked List</code>&nbsp;<code>Data Structures</code>&nbsp;