<h2><a href="https://leetcode.com/problems/repeated-string-match">686. Repeated String Match</a></h2><h3>Medium</h3><hr><p>You are given two strings <code>a</code> and <code>b</code>​​​​​​​ consisting of lowercase English letters​​​​​​​.</p>

<p>Return the <strong>minimum</strong> number of times you should repeat string <code>a</code> so that string <code>b</code> is a <strong>substring</strong> of it. If it is <strong>impossible</strong> for <code>b</code>​​​​​​ to be a substring of <code>a</code> after repeating it, return&nbsp;-1.</p>

<p><strong>Note:</strong> string <code>&quot;abc&quot;</code> repeated 0 times is <code>&quot;&quot;</code>, repeated 1 time is <code>&quot;abc&quot;</code> and repeated 2 times is <code>&quot;abcabc&quot;</code>.</p>
A <strong>subarray</strong> is a contiguous sequence of elements within an array.
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> a = &quot;abcd&quot;, b = &quot;cdabcdab&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> We return 3 because by repeating a three times &quot;ab<strong>cdabcdab</strong>cd&quot;, b is a substring of it.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> a = &quot;a&quot;, b = &quot;aa&quot;
<strong>Output:</strong> 2
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= a.length, b.length &lt;= 10<sup>4</sup></code></li>
	<li><code>a</code> and <code>b</code> consist of lowercase English letters.</li>
</ul>
