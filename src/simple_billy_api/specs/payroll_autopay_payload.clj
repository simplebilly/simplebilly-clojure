(ns simple-billy-api.specs.payroll-autopay-payload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def payroll-autopay-payload-data
  {
   (ds/opt :debtor_bic) string?
   (ds/opt :debtor_iban) string?
   (ds/opt :debtor_name) string?
   (ds/opt :execution_date) inst?
   })

(def payroll-autopay-payload-spec
  (ds/spec
    {:name ::payroll-autopay-payload
     :spec payroll-autopay-payload-data}))
