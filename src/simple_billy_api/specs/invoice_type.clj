(ns simple-billy-api.specs.invoice-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invoice-type-data
  {
   })

(def invoice-type-spec
  (ds/spec
    {:name ::invoice-type
     :spec invoice-type-data}))
