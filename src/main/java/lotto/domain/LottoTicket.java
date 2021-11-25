package lotto.domain;

import java.util.List;

public class LottoTicket {

  private static final String INVALID_SIZE_OF_NUMBER = "6개 이상의 숫자 입니다.";
  private static final int LOTTO_SIZE = 6;

  private final List<LottoNumber> numbers;

  public LottoTicket(List<LottoNumber> numbers) {
    if (numbers.size() > LOTTO_SIZE) {
      throw new IllegalArgumentException(INVALID_SIZE_OF_NUMBER);
    }
    this.numbers = numbers;
  }

  public int size() {
    return numbers.size();
  }

  public List<LottoNumber> getNumbers() {
    return numbers;
  }
}
