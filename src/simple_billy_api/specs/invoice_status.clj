(ns simple-billy-api.specs.invoice-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invoice-status-data
  {
   })

(def invoice-status-spec
  (ds/spec
    {:name ::invoice-status
     :spec invoice-status-data}))
