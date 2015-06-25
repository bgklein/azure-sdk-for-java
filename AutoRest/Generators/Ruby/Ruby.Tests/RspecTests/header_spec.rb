require "base64"
require_relative 'Header/sdk_requirements'
include MyNamespace

describe Header do
  before(:all) do
    @base_url = ENV['StubServerURI']
    client = MyNamespace::AutoRestSwaggerBATHeaderService.new(@base_url)
    @header_client = MyNamespace::Header.new(client)
  end
  def to_bool(str)
    return true if str =~ (/^(true)$/i)
    return false if str =~ (/^(false)$/i)
    raise ArgumentError
  end

  it 'should create test service' do
    expect{MyNamespace::AutoRestSwaggerBATHeaderService.new(@base_url)}.not_to raise_error
  end
  it 'should post param existing key' do
    result = @header_client.param_existing_key('overwrite').value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to eq(true)
  end
  it 'should get response existing key' do
    result = @header_client.response_existing_key().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['user-agent']).to eq('overwrite')
  end
  it 'should post param protected key' do
    result = @header_client.param_protected_key('text/html').value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response protected key' do
    result = @header_client.response_protected_key().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['content-type']).to eq('text/html; charset=utf-8')
  end

  it 'should post positive param integer' do
    result = @header_client.param_integer("positive", 1).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post negative param integer' do
    result = @header_client.param_integer("negative", -2).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response negative integer' do
    result = @header_client.response_integer("negative").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value'].to_i).to eq(-2)
  end
  it 'should get response positive integer' do
    result = @header_client.response_integer("positive").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value'].to_i).to eq(1)
  end

  it 'should post positive param long' do
    result = @header_client.param_long("positive", 105).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post negative param long' do
    result = @header_client.param_long("negative", -2).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response negative long' do
    result = @header_client.response_long("negative").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value'].to_i).to eq(-2)
  end
  it 'should get response positive long' do
    result = @header_client.response_long("positive").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value'].to_i).to eq(105)
  end

  it 'should post positive param float' do
    result = @header_client.param_float("positive", 0.07).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post negative param float' do
    result = @header_client.param_float("negative", -3.0).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response negative float' do
    result = @header_client.response_float("negative").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value'].to_f).to eq(-3.0)
  end
  it 'should get response positive float' do
    result = @header_client.response_float("positive").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value'].to_f).to eq(0.07)
  end

  it 'should post positive param double' do
    result = @header_client.param_double("positive", 7e120).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post negative param double' do
    result = @header_client.param_double("negative", -3.0).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response negative double' do
    result = @header_client.response_double("negative").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value'].to_f).to eq(-3.0)
  end
  it 'should get response positive double' do
    result = @header_client.response_double("positive").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value'].to_f).to eq(7e120)
  end

  it 'should post positive param bool' do
    result = @header_client.param_bool("true", true).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post negative param bool' do
    result = @header_client.param_bool("false", false).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response negative bool' do
    result = @header_client.response_bool("true").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(to_bool(result.response.header['value'])).to eq(true)
  end
  it 'should get response positive bool' do
    result = @header_client.response_bool("false").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(to_bool(result.response.header['value'])).to eq(false)
  end

  it 'should post valid param string' do
    result = @header_client.param_string("valid", "The quick brown fox jumps over the lazy dog").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post null param string' do
    result = @header_client.param_string("null", nil).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post empty param string' do
    result = @header_client.param_bool("empty", "").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get valid response string' do
    result = @header_client.response_string("valid").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value']).to eq("The quick brown fox jumps over the lazy dog")
  end
  it 'should get null response string' do
    result = @header_client.response_string("null").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value']).to eq("null")
  end
  it 'should get empty response string' do
    result = @header_client.response_string("empty").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.response.header['value']).to eq("")
  end

  it 'should post valid param date' do
    result = @header_client.param_date("valid", Date.parse('2010-01-01')).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post min param date' do
    result = @header_client.param_date("min", Date.parse('0001-01-01')).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response valid date' do
    result = @header_client.response_date("valid").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(Date.parse(result.response.header['value'])).to eq(Date.parse('2010-01-01'))
  end
  it 'should get response min date' do
    result = @header_client.response_date("min").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(Date.parse(result.response.header['value'])).to eq(Date.parse('0001-01-01'))
  end

  it 'should post valid param dateTime' do
    result = @header_client.param_datetime("valid", DateTime.parse('2010-01-01T12:34:56Z')).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should post min param dateTime' do
    result = @header_client.param_datetime("min", DateTime.parse('0001-01-01T00:00:00Z')).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response valid dateTime' do
    result = @header_client.response_datetime("valid").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(Date.parse(result.response.header['value'])).to eq(Date.parse('2010-01-01T12:34:56Z'))
  end
  it 'should get response min dateTime' do
    result = @header_client.response_datetime("min").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(Date.parse(result.response.header['value'])).to eq(Date.parse('0001-01-01T00:00:00Z'))
  end

  it 'should post valid byte' do
    result = @header_client.param_byte("valid", "??????????".bytes).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get response valid byte' do
    result = @header_client.response_byte("valid").value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(Base64.decode64(result.response.header['value'])).to eq("啊齄丂狛狜隣郎隣兀﨩".bytes.pack('U*'))
  end
end