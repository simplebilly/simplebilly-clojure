(ns simple-billy-api.specs.convert-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def convert-response-data
  {
   (ds/req :invoiceId) string?
   (ds/req :invoiceNumber) string?
   (ds/req :proformaId) string?
   (ds/req :proformaNumber) string?
   })

(def convert-response-spec
  (ds/spec
    {:name ::convert-response
     :spec convert-response-data}))
