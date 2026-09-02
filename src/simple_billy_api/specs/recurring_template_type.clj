(ns simple-billy-api.specs.recurring-template-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def recurring-template-type-data
  {
   })

(def recurring-template-type-spec
  (ds/spec
    {:name ::recurring-template-type
     :spec recurring-template-type-data}))
