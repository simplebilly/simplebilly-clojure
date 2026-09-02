(ns simple-billy-api.specs.country-code
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def country-code-data
  {
   })

(def country-code-spec
  (ds/spec
    {:name ::country-code
     :spec country-code-data}))
