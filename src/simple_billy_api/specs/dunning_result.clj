(ns simple-billy-api.specs.dunning-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dunning-result-data
  {
   (ds/req :invoices_processed) int?
   (ds/req :message) string?
   })

(def dunning-result-spec
  (ds/spec
    {:name ::dunning-result
     :spec dunning-result-data}))
