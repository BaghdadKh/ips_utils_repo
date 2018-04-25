Summary: IPS Java Utils
Name: ips_javautils
Vendor: Institute of Phonetics and Speech Processing
Version: @version@
Release: 0 
Source0: %{name}-%{version}.tar.gz
License: LGPL Version 3
Group: Development/Tools
BuildRoot: %{_builddir}/%{name}-root
# Pure Java package:
BuildArch: noarch
#Requires: java >= 1.5.0
Prefix: /usr/local

%description
Java Utils library of the Institute of Phonetics and Speech Processing

%prep
%setup -q
%build
%install
mkdir -p $RPM_BUILD_ROOT/usr/local/lib/ips
install -m 644 lib/%{name}-%{version}.jar $RPM_BUILD_ROOT/usr/local/lib/ips/%{name}-%{version}.jar
(cd $RPM_BUILD_ROOT/usr/local/lib/ips;ln -s %{name}-%{version}.jar %{name}.jar)
%clean
rm -rf $RPM_BUILD_ROOT
%files
%defattr(-,root,root)
/usr/local/lib/ips/%{name}-%{version}.jar
/usr/local/lib/ips/%{name}.jar
