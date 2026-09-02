(ns simple-billy-api.specs.bank-lookup
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bank-lookup-data
  {
   (ds/opt :bank_name) string?
   (ds/opt :bic) string?
   (ds/req :iban) string?
   (ds/opt :nextgenpsd2_url) string?
   (ds/req :psd2_supported) boolean?
   })

(def bank-lookup-spec
  (ds/spec
    {:name ::bank-lookup
     :spec bank-lookup-data}))
