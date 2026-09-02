(ns simple-billy-api.specs.e-bilanz-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.account-overview :refer :all]
            [simple-billy-api.specs.balance-sheet :refer :all]
            [simple-billy-api.specs.income-statement :refer :all]
            [simple-billy-api.specs.vat-summary :refer :all]
            )
  (:import (java.io File)))


(def e-bilanz-report-data
  {
   (ds/req :account_overview) (s/coll-of account-overview-spec)
   (ds/req :balance_sheet) balance-sheet-spec
   (ds/req :generated_at) string?
   (ds/req :income_statement) income-statement-spec
   (ds/req :period) string?
   (ds/req :vat_summary) vat-summary-spec
   })

(def e-bilanz-report-spec
  (ds/spec
    {:name ::e-bilanz-report
     :spec e-bilanz-report-data}))
