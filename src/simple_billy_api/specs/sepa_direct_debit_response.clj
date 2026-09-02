(ns simple-billy-api.specs.sepa-direct-debit-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sepa-direct-debit-response-data
  {
   (ds/req :content_type) string?
   (ds/req :filename) string?
   (ds/req :xml_content) string?
   })

(def sepa-direct-debit-response-spec
  (ds/spec
    {:name ::sepa-direct-debit-response
     :spec sepa-direct-debit-response-data}))
